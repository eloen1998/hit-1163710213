package ljn.mapper;

import java.util.List;

import ljn.bean.Customer;

public interface CustomerMapper {
	public List<Customer> query();
	public List<Customer> querybykind(int kind);
	public Customer querybycid(String cid);
	public void add(Customer customer);
	public void update(Customer customer);
	public void remove(String cid);
}
