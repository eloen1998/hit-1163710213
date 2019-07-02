package ljn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ljn.bean.User;
import ljn.mapper.UserMapper;
import ljn.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper usermapper;
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		usermapper.add(user);
	}

	@Override
	public List<User> query() {
		// TODO Auto-generated method stub
		return usermapper.query();
	}

	@Override
	public User querybyid(int id) {
		// TODO Auto-generated method stub
		return usermapper.querybyid(id);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		usermapper.remove(id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		usermapper.update(user);
	}

}
