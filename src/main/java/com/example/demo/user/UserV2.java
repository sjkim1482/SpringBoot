package com.example.demo.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
//// @JsonIgnoreProperties(value={"password","ssn"}) => password와 ssn이 클라이언트에서 안보이게함
//@JsonIgnoreProperties(value={"password","ssn"})
@JsonFilter("UserInfoV2")
public class UserV2 extends User {
	private String grade;

	
	public UserV2() {
		// TODO Auto-generated constructor stub
	}
	
	public UserV2(String grade) {
		super();
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "UserV2 []";
	}
	
	
	
}
