package ljn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ljn.bean.Customer;
import ljn.bean.Good;
import ljn.bean.House;
import ljn.bean.Order;
import ljn.service.CustomerService;
import ljn.service.GoodService;
import ljn.service.HouseService;
import ljn.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderservice;
	@Autowired
	private CustomerService customerservice;
	@Autowired
	private GoodService goodservice;
	@Autowired
	private HouseService houseservice;
	@RequestMapping("/orderquery")
	public String query(Map map) {
		map.put("orders", orderservice.query());
		return "orderquery";
	}

	@RequestMapping("/orderquerybyoid")
	public String querybyoid(String oid, Map map) {
		Order order = orderservice.querybyoid(oid);
		map.put("order", order);
		return "orderupdate";
	}

	@RequestMapping("/orderqueryoid")
	public String queryoid(String oid, Map map) {
		if (oid.equals("")) {
			map.put("orders", orderservice.query());
		} else {
			Order order = orderservice.querybyoid(oid);
			List<Order> orders = new ArrayList<Order>();
			orders.add(order);
			map.put("orders", orders);
		}
		return "orderquery";
	}

	@RequestMapping("/orderadd")
	public String add(String oid, String date, int kind, String gid,String num,
			String cid) {
		float amount=0;
		Good good = goodservice.querybygid(gid);
		Customer customer = customerservice.querybycid(cid);
		if(kind==1){
			amount=good.getOutprice1()*Integer.parseInt(num);
		}
		else {
			amount=good.getOutprice2()*Integer.parseInt(num);
		}
		float profit=amount-good.getInprice()*Integer.parseInt(num);
		Order order = new Order(oid, date, kind, gid, good.getName(), Integer.parseInt(num), cid, customer.getName(),amount,profit);
		orderservice.add(order);
		return "redirect:orderquery";
	}

	@RequestMapping("/orderupdate")
	public String update(int ID,String oid, String date, int kind, String gid,String num,
			String cid) {
		float amount=0;
		Good good = goodservice.querybygid(gid);
		Customer customer = customerservice.querybycid(cid);
		if(kind==1){
			amount=good.getOutprice1()*Integer.parseInt(num);
		}
		else {
			amount=good.getOutprice2()*Integer.parseInt(num);
		}
		float profit=amount-good.getInprice()*Integer.parseInt(num);
		Order order = new Order(ID, oid, date, kind, gid, good.getName(), Integer.parseInt(num), cid, customer.getName(),amount,profit);
		orderservice.update(order);
		return "redirect:orderquery";
	}

	@RequestMapping("/orderremove")
	public String remove(String oid) {
		orderservice.remove(oid);
		return "redirect:orderquery";
	}

	@RequestMapping("/orderend")
	public String end(String oid) {
		Order order=orderservice.querybyoid(oid);
		House house=houseservice.querybygid(order.getGid());
		house.setNum(house.getNum()-order.getNum());
		houseservice.update(house);
		orderservice.remove(oid);
		return "redirect:orderquery";
	}
}
