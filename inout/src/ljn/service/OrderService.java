package ljn.service;

import java.util.List;

import ljn.bean.Good;
import ljn.bean.Order;


public interface OrderService {
	public List<Order> query();
	public Order querybyoid(String oid);
	public void add(Order order);
	public void remove(String oid);
	public void update(Order order);
}
