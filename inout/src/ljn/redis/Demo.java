package ljn.redis;

import redis.clients.jedis.Jedis;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jedis jedis = new Jedis("localhost", 6379, 100000);
		System.out.println(jedis.keys("*"));
	}
}
