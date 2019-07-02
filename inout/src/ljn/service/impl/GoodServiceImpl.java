package ljn.service.impl;

import java.util.List;

import ljn.bean.Good;
import ljn.mapper.GoodMapper;
import ljn.redis.GoodRedis;
import ljn.service.GoodService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl implements GoodService {

	@Autowired
	private GoodMapper goodmapper;
	
	private GoodRedis goodredis;
	@Override
	public void add(Good good) {
		// TODO Auto-generated method stub
        goodmapper.add(good);
	}

	@Override
	public List<Good> query() {
		// TODO Auto-generated method stub
		return goodmapper.query();
	}

	@Override
	public Good querybygid(String gid) {
		// TODO Auto-generated method stub
		goodredis=new GoodRedis();
		if(goodredis.contain(gid)){
			System.out.println("缓存命中");
			return goodredis.get(gid);
		}
		else{
			Good good=goodmapper.querybygid(gid);
			goodredis.add(good);
			System.out.println("缓存未命中，从数据库中读取数据");
			return good;
		}
	}

	@Override
	public void remove(String gid) {
		// TODO Auto-generated method stub
		goodredis=new GoodRedis();
		if(goodredis.contain(gid)){
			goodredis.remove(gid);
		}
        goodmapper.remove(gid);
	}

	@Override
	public void update(Good good) {
		// TODO Auto-generated method stub
		goodredis=new GoodRedis();
		if(goodredis.contain(good.getGid())){
			goodredis.update(good);
		}
		goodmapper.update(good);
	}

}
