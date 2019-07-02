package ljn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ljn.bean.House;
import ljn.mapper.HouseMapper;
import ljn.service.HouseService;
@Service
public class HouseServiceImpl implements HouseService {

	@Autowired
	private HouseMapper housemapper;
	@Override
	public void add(House house) {
		// TODO Auto-generated method stub
		housemapper.add(house);
	}

	@Override
	public List<House> query() {
		// TODO Auto-generated method stub
		return housemapper.query();
	}

	@Override
	public House querybygid(String gid) {
		// TODO Auto-generated method stub
		return housemapper.querybygid(gid);
	}

	@Override
	public void remove(String gid) {
		// TODO Auto-generated method stub
		housemapper.remove(gid);
	}

	@Override
	public void update(House house) {
		// TODO Auto-generated method stub
		housemapper.update(house);
	}

}
