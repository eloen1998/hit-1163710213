package ljn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ljn.bean.Good;
import ljn.service.GoodService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodController {
	@Autowired
	private GoodService goodservice;

	@RequestMapping("/goodquery")
	public String query(Map map) {
		map.put("goods", goodservice.query());
		return "goodquery";
	}

	@RequestMapping("/goodquerybygid")
	public String querybygid(String gid, Map map) {
		Good good = goodservice.querybygid(gid);
		map.put("good", good);
		return "goodupdate";
	}

	@RequestMapping("/goodquerygid")
	public String querygid(String gid, Map map) {
		if (gid.equals("")) {
			map.put("goods", goodservice.query());
		} else {
			Good good = goodservice.querybygid(gid);
			List<Good> goods = new ArrayList<Good>();
			goods.add(good);
			map.put("goods", goods);
		}
		return "goodquery";
	}

	@RequestMapping("/goodadd")
	public String add(String gid, String kind, String name, float inprice,
			float outprice1, float outprice2) {
		Good good = new Good(gid, kind, name, inprice, outprice1, outprice2);
		goodservice.add(good);
		return "redirect:goodquery";
	}

	@RequestMapping("/goodupdate")
	public String update(int ID, String gid, String kind, String name,
			float inprice, float outprice1, float outprice2) {
		Good good = new Good(ID, gid, kind, name, inprice, outprice1, outprice2);
		goodservice.update(good);
		return "redirect:goodquery";
	}

	@RequestMapping("/goodremove")
	public String remove(String gid) {
		goodservice.remove(gid);
		return "redirect:goodquery";
	}

}
