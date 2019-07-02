package ljn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ljn.bean.Customer;
import ljn.mapper.CustomerMapper;
import ljn.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customermapper;
	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		customermapper.add(customer);
	}

	@Override
	public List<Customer> query() {
		// TODO Auto-generated method stub
		return customermapper.query();
	}

	@Override
	public Customer querybycid(String cid) {
		// TODO Auto-generated method stub
		return customermapper.querybycid(cid);
	}

	@Override
	public List<Customer> querybykind(int kind) {
		// TODO Auto-generated method stub
		return customermapper.querybykind(kind);
	}

	@Override
	public void remove(String cid) {
		// TODO Auto-generated method stub
		customermapper.remove(cid);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customermapper.update(customer);
	}

}
