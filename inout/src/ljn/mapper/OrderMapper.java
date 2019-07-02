package ljn.mapper;

import java.util.List;

import ljn.bean.Good;
import ljn.bean.Order;


public interface OrderMapper {
	public List<Order> query();
	public Order querybyoid(String oid);    //按订单号查询订单
	public List<Order> queryoid(String oid);//按订单号查询订单内商品信息
	public void add(Order order);
	public void remove(String oid);
	public void update(Order order);
}
