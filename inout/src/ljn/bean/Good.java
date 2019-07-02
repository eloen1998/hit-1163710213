package ljn.bean;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

public class Good {
	private int ID;
	private String gid;
	private String kind;
	private String name;
	private float inprice;
	private float outprice1;
	private float outprice2;

	public Good() { 
		BasicDataSource d;
		SqlSessionFactoryBean  a;
		MapperScannerConfigurer  b;
	}

	public Good(String gid, String kind, String name, float inprice,
			float outprice1, float outprice2) {
		super();
		this.gid = gid;
		this.kind = kind;
		this.name = name;
		this.inprice = inprice;
		this.outprice1 = outprice1;
		this.outprice2 = outprice2;
	}

	public Good(int iD, String gid, String kind, String name, float inprice,
			float outprice1, float outprice2) {
		super();
		ID = iD;
		this.gid = gid;
		this.kind = kind;
		this.name = name;
		this.inprice = inprice;
		this.outprice1 = outprice1;
		this.outprice2 = outprice2;
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getInprice() {
		return inprice;
	}

	public void setInprice(float inprice) {
		this.inprice = inprice;
	}

	public float getOutprice1() {
		return outprice1;
	}

	public void setOutprice1(float outprice1) {
		this.outprice1 = outprice1;
	}

	public float getOutprice2() {
		return outprice2;
	}

	public void setOutprice2(float outprice2) {
		this.outprice2 = outprice2;
	}

	@Override
	public String toString() {
		return "Good [ID=" + ID + ", gid=" + gid + ", inprice=" + inprice
				+ ", kind=" + kind + ", name=" + name + ", outprice1="
				+ outprice1 + ", outprice2=" + outprice2 + "]";
	}

}
