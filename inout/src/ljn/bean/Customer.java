package ljn.bean;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

public class Customer {
	int ID;
	String cid;
	String name;
	String phone;
	int kind;
	
	public Customer() { 
		BasicDataSource d;
		SqlSessionFactoryBean  a;
		MapperScannerConfigurer  b;
	}

	public Customer(int iD, String cid, String name, String phone, int kind) {
		super();
		ID = iD;
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.kind = kind;
	}

	public Customer(String cid, String name, String phone, int kind) {
		super();
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.kind = kind;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "customer [ID=" + ID + ", cid=" + cid + ", kind=" + kind
				+ ", name=" + name + ", phone=" + phone + "]";
	}
	
}
