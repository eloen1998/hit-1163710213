package ljn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ljn.bean.Good;
import ljn.bean.User;
import ljn.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/userquery")
	public String query(Map map) {
		map.put("users", userservice.query());
		return "userquery";
	}
	
	@RequestMapping("/userquerybyid")
	public String querybygid(String id, Map map) {
		User user = userservice.querybyid(Integer.parseInt(id));
		map.put("user", user);
		return "userupdate";
	}

	@RequestMapping("/userqueryid")
	public String querygid(String id, Map map) {
		if (id.equals("")) {
			map.put("users", userservice.query());
		} else {
			User user = userservice.querybyid(Integer.parseInt(id));
			List<User> users = new ArrayList<User>();
			users.add(user);
			map.put("users", users);
		}
		return "userquery";
	}

	@RequestMapping("/useradd")
	public String add(String username, String password, boolean isadmin) {
		User user = new User(username,password,isadmin);
		userservice.add(user);
		return "redirect:userquery";
	}

	@RequestMapping("/userupdate")
	public String update(int ID, String username, String password, boolean isadmin) {
		User user = new User(ID,username,password,isadmin);
		userservice.update(user);
		return "redirect:userquery";
	}

	@RequestMapping("/userremove")
	public String remove(String id) {
		userservice.remove(Integer.parseInt(id));
		return "redirect:userquery";
	}
}
