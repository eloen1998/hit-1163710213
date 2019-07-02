package ljn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ljn.bean.Order;
import ljn.mapper.OrderMapper;
import ljn.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper ordermapper;
	@Override
	public void add(Order order) {
		// TODO Auto-generated method stub
		ordermapper.add(order);
	}

	@Override
	public List<Order> query() {
		// TODO Auto-generated method stub
		return ordermapper.query();
	}

	@Override
	public Order querybyoid(String oid) {
		// TODO Auto-generated method stub
		return ordermapper.querybyoid(oid);
	}

	@Override
	public void remove(String oid) {
		// TODO Auto-generated method stub
		ordermapper.remove(oid);
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		ordermapper.update(order);
	}

}
