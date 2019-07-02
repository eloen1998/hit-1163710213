package ljn.mapper;

import java.util.List;

import ljn.bean.House;

public interface HouseMapper {
	public List<House> query();
	public House querybygid(String gid);
	public void add(House house);
	public void update(House house);
	public void remove(String gid);
}
