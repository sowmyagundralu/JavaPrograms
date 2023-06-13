package com.medicine.user.model;

public class UserDt {

	private String userid;
	private int password;
	public UserDt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDt(String userid, int password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDt [userid=" + userid + ", password=" + password + "]";
	}
	
}
