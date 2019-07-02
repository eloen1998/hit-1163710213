package ljn.mapper;

import java.util.List;

import ljn.bean.User;

public interface UserMapper {
	public List<User> query();
	public User querybyid(int id);
	public void add(User user);
	public void update(User user);
	public void remove(int id);
}
