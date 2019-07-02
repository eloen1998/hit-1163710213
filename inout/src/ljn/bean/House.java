package ljn.bean;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

public class House {
	private int ID;
	private String gid;
	private String gname;
	private int num;
	private String date;
	
	public House() { 
		BasicDataSource d;
		SqlSessionFactoryBean  a;
		MapperScannerConfigurer  b;
	}

	public House(int iD, String gid, String gname, int num, String date) {
		super();
		ID = iD;
		this.gid = gid;
		this.gname = gname;
		this.num = num;
		this.date = date;
	}

	public House(String gid, String gname, int num, String date) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.num = num;
		this.date = date;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "House [ID=" + ID + ", date=" + date + ", gid=" + gid
				+ ", gname=" + gname + ", num=" + num + "]";
	}
	
	
}
