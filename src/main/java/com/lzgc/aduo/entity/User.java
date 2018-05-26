package com.lzgc.aduo.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String username;
	private String loginname;
	private String password;
	private Date lastlogintime;
	private Integer status;
	private Integer age;
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public User(Integer id, String username, String loginname, String password, Date lastlogintime, Integer status,
			Integer age, Date createTime) {
		super();
		this.id = id;
		this.username = username;
		this.loginname = loginname;
		this.password = password;
		this.lastlogintime = lastlogintime;
		this.status = status;
		this.age = age;
		this.createTime = createTime;
	}
	public User() {
		super();
	}
	public byte[] getCredentialsSalt() {
		// TODO Auto-generated method stub
		return null;
	}
}
