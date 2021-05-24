package com.example.demo.user;

import java.util.Date;



public class User {
	private Integer id;
	private String name;
	private Date joinDate;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer id, String name, Date joinDate) {
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "UserVo [id=" + id + ", name=" + name + ", joinDate=" + joinDate + "]";
	}
	
	
}
