package ljn.bean;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

public class Order {
	private int ID;
	private String oid;
	private String date;
	private int kind;
	private String gid;
	private String gname;
	private int num;
	private String cid;
	private String cname;
	private float amount;
	private float profit;
	
	public Order() { 
		BasicDataSource d;
		SqlSessionFactoryBean  a;
		MapperScannerConfigurer  b;
	}

	public Order(int iD, String oid, String date, int kind, String gid,
			String gname, int num, String cid, String cname, float amount,
			float profit) {
		super();
		ID = iD;
		this.oid = oid;
		this.date = date;
		this.kind = kind;
		this.gid = gid;
		this.gname = gname;
		this.num = num;
		this.cid = cid;
		this.cname = cname;
		this.amount = amount;
		this.profit = profit;
	}

	public Order(String oid, String date, int kind, String gid, String gname,
			int num, String cid, String cname, float amount, float profit) {
		super();
		this.oid = oid;
		this.date = date;
		this.kind = kind;
		this.gid = gid;
		this.gname = gname;
		this.num = num;
		this.cid = cid;
		this.cname = cname;
		this.amount = amount;
		this.profit = profit;
	}

	public Order(String oid, String date, int kind) {
		super();
		this.oid = oid;
		this.date = date;
		this.kind = kind;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
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

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}

	@Override
	public String toString() {
		return "Order [ID=" + ID + ", amount=" + amount + ", cid=" + cid
				+ ", cname=" + cname + ", date=" + date + ", gid=" + gid
				+ ", gname=" + gname + ", kind=" + kind + ", num=" + num
				+ ", oid=" + oid + ", profit=" + profit + "]";
	}

}
