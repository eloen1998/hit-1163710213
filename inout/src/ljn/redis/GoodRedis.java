package ljn.redis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;
import ljn.bean.Good;

public class GoodRedis {
	
	public boolean contain(String gid){
		Jedis jedis = new Jedis("localhost", 6379, 100000);
		String key = "good" + gid;
		return jedis.exists(key) ;
	}
	
	public void add(Good good) {
		Jedis jedis = new Jedis("localhost", 6379, 100000);
		String key = "good" + good.getGid();
		Map<String, String> map = new HashMap<String, String>();
		map.put("ID", good.getID() + "");
		map.put("kind", good.getKind());
		map.put("name", good.getName());
		map.put("inprice", good.getInprice() + "");
		map.put("outprice1", good.getOutprice1() + "");
		map.put("outprice2", good.getOutprice2() + "");
		jedis.hmset(key, map);
		jedis.expire(key, 300);
	}

	public Good get(String gid) {
		Jedis jedis = new Jedis("localhost", 6379, 100000);
		String key = "good" + gid;
		Good good = null;
		List<String> set = jedis.hmget(key, "ID", "kind", "name", "inprice",
				"outprice1", "outprice2");
		good = new Good(Integer.parseInt(set.get(0)), gid, set.get(1), set
				.get(2), Float.parseFloat(set.get(3)), Float.parseFloat(set
				.get(4)), Float.parseFloat(set.get(5)));
		return good;
	}

	public void remove(String gid) {
		Jedis jedis = new Jedis("localhost", 6379, 100000);
		String key = "good" + gid;
		if (jedis.exists(key))
			jedis.del(key);
	}
	
	public void update(Good good){
		Jedis jedis = new Jedis("localhost", 6379, 100000);
		Map<String, String> map = new HashMap<String, String>();
		String key = "good" + good.getGid();
		map.put("ID", good.getID() + "");
		map.put("kind", good.getKind());
		map.put("name", good.getName());
		map.put("inprice", good.getInprice() + "");
		map.put("outprice1", good.getOutprice1() + "");
		map.put("outprice2", good.getOutprice2() + "");
		jedis.del(key);
		jedis.hmset(key, map);
		jedis.expire(key, 300);
	}
}
