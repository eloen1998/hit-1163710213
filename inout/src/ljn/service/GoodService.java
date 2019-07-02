package ljn.service;

import java.util.List;

import ljn.bean.Good;


public interface GoodService {
	public List<Good> query();
	public Good querybygid(String gid);
	public void add(Good good);
	public void remove(String gid);
	public void update(Good good);
}
