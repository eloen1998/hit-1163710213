package ljn.bean;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

public class User {
	int ID;
	private String username;
	private String password;
	boolean isadmin;
	
	public User() { 
		BasicDataSource d;
		SqlSessionFactoryBean  a;
		MapperScannerConfigurer  b;
	}

	public User(int iD, String username, String password, boolean isadmin) {
		super();
		ID = iD;
		this.username = username;
		this.password = password;
		this.isadmin = isadmin;
	}

	public User(String username, String password, boolean isadmin) {
		super();
		this.username = username;
		this.password = password;
		this.isadmin = isadmin;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", isadmin=" + isadmin + ", password="
				+ password + ", username=" + username + "]";
	}
	
}
