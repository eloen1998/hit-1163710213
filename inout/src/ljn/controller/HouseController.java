package ljn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ljn.bean.Good;
import ljn.bean.House;
import ljn.service.GoodService;
import ljn.service.HouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HouseController {
	@Autowired
	private HouseService houseservice;
	@Autowired
	private GoodService goodservice;
	
	@RequestMapping("/housequery")
	public String query(Map map) {
		map.put("houses", houseservice.query());
		return "housequery";
	}

	@RequestMapping("/housequerybygid")
	public String querybygid(String gid, Map map) {
		House house = houseservice.querybygid(gid);
		map.put("house", house);
		return "houseupdate";
	}

	@RequestMapping("/housequerygid")
	public String querygid(String gid, Map map) {
		if (gid.equals("")) {
			map.put("houses", houseservice.query());
		} else {
			House house = houseservice.querybygid(gid);
			List<House> houses = new ArrayList<House>();
			if(house!=null)
			houses.add(house);
			map.put("houses", houses);
		}
		return "housequery";
	}

	@RequestMapping("/houseadd")
	public String add(String gid, String num, String date) {
		String gname=goodservice.querybygid(gid).getName();
		House house= new House(gid,gname,Integer.parseInt(num),date);
		houseservice.add(house);
		return "redirect:housequery";
	}

	@RequestMapping("/houseupdate")
	public String update(int ID, String gid, String gname, String num, String innum, String newdate) {
		House house= new House(ID,gid,gname,Integer.parseInt(num)+Integer.parseInt(innum),newdate);
		houseservice.update(house);
		return "redirect:housequery";
	}

	@RequestMapping("/houseremove")
	public String remove(String gid) {
		houseservice.remove(gid);
		return "redirect:housequery";
	}

}
