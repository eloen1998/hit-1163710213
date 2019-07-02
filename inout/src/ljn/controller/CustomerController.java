package ljn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import ljn.bean.Customer;
import ljn.bean.Good;
import ljn.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerservice;

	@RequestMapping("/customerquery")
	public String query(Map map) {
		map.put("customers", customerservice.query());
		return "customerquery";
	}
	
	@RequestMapping("/customerquerybykind")
	public String querybykind(Map map,String kind) {
		Pattern pattern = Pattern.compile("[0-9]*"); 
		if (kind.equals("")||!pattern.matcher(kind).matches()) {
			map.put("customers", customerservice.query());
		} 
		else{
			map.put("customers", customerservice.querybykind(Integer.parseInt(kind)));
		}
		return "customerquery";
	}
	
	@RequestMapping("/customerquerybycid")
	public String querybycid(Map map,String cid) {
		map.put("customer", customerservice.querybycid(cid));
		return "customerupdate";
	}
	
	@RequestMapping("/customerquerycid")
	public String querycid(String cid, Map map) {
		if (cid.equals("")) {
			map.put("customers", customerservice.query());
		} else {
			Customer customer = customerservice.querybycid(cid);
			List<Customer> customers = new ArrayList<Customer>();
			if(customer!=null)
			customers.add(customer);
			map.put("customers", customers);
		}
		return "customerquery";
	}
	
	@RequestMapping("/customeradd")
	public String add(String cid, String name, String phone, String kind) {
		Customer customer = new Customer(cid,name,phone,Integer.parseInt(kind));
		customerservice.add(customer);
		return "redirect:customerquery";
	}

	@RequestMapping("/customerupdate")
	public String update(int ID,String cid, String name, String phone, String kind) {
		Customer customer = new Customer(ID,cid,name,phone,Integer.parseInt(kind));
		customerservice.update(customer);
		return "redirect:customerquery";
	}

	@RequestMapping("/customerremove")
	public String remove(String cid) {
		customerservice.remove(cid);
		return "redirect:customerquery";
	}
}
