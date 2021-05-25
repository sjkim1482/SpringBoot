package com.example.demo.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
//// @JsonIgnoreProperties(value={"password","ssn"}) => password와 ssn이 클라이언트에서 안보이게함
//@JsonIgnoreProperties(value={"password","ssn"})
@JsonFilter("UserInfo")
public class User {
	private Integer id;
	
	@Size(min=2, message = "Name은 2글자 이상 입력해 주세요.")
	private String name;
	
	@Past
	private Date joinDate;
	
//	// @JsonIgnore ->클라이언트에서 안보이게함
//	@JsonIgnore
	
	private String password;
//	@JsonIgnore
	private String ssn;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

	public User(Integer id, @Size(min = 2, message = "Name은 2글자 이상 입력해 주세요.") String name, @Past Date joinDate,
			String password, String ssn) {
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
		this.password = password;
		this.ssn = ssn;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getSsn() {
		return ssn;
	}



	public void setSsn(String ssn) {
		this.ssn = ssn;
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
		return "User [id=" + id + ", name=" + name + ", joinDate=" + joinDate + ", password=" + password + ", ssn="
				+ ssn + "]";
	}

	
	
}
