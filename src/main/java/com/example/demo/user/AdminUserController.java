package com.example.demo.user;

import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;


@RestController
@RequestMapping("/admin")
public class AdminUserController {
	
	private UserDaoService service;
	
	public AdminUserController(UserDaoService service) {
		this.service = service;
	}
	
	@GetMapping("/users")
	public MappingJacksonValue retrieveAllUsers(){
		List<User> userList = service.findAll();
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","name","joinDate","password");
		
		//필터를 mapping에 넣을수 있게 변환
		FilterProvider filters = new SimpleFilterProvider().addFilter("UserInfo",filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(userList);
		// filter 적용
		mapping.setFilters(filters);
		
		return mapping;
	}
	
	// GET /users/1 or /users/10
//	@GetMapping("v1/user/{id}")
	//파라미터에 버전을 다는방법
	//version을 사용해야하기 때문에 뒤에 /가 붙어야함
//	@GetMapping(value = "/user/{id}/", params = "version=1")
	//Header를 이용
//	@GetMapping(value = "/users/{id}",headers = "X-API-VERSION=1")
	@GetMapping(value = "/users/{id}", produces = "application/vnd.company.appv1+json")
	public MappingJacksonValue retrieveUserV1(@PathVariable int id) {
		User user = service.findOne(id);
		
		if(user == null) {
			throw new UserNotFoundException(String.format("ID[%s] 못찾았당", id));
		}
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","name","password","ssn");
		
		//필터를 mapping에 넣을수 있게 변환
		FilterProvider filters = new SimpleFilterProvider().addFilter("UserInfo",filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(user);
		// filter 적용
		mapping.setFilters(filters);
		
		return mapping;
	}
	
//	@GetMapping("v2/user/{id}")
	//파라미터에 버전을 다는방법
	//version을 사용해야하기 때문에 뒤에 /가 붙어야함
//	@GetMapping(value = "/user/{id}/", params = "version=2")
	//Header를 이용
//	@GetMapping(value = "/users/{id}",headers = "X-API-VERSION=2")
	//마임타입을 이용
	@GetMapping(value = "/users/{id}", produces = "application/vnd.company.appv2+json")
	public MappingJacksonValue retrieveUserV2(@PathVariable int id) {
		User user = service.findOne(id);
		
		if(user == null) {
			throw new UserNotFoundException(String.format("ID[%s] 못찾았당", id));
		}
		
		// User -> User2
		UserV2 userV2 = new UserV2();
		//상속받고 그값에다 grade를 넣어줌
		BeanUtils.copyProperties(user, userV2);
		userV2.setGrade("VIP");
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","name","joinDate","grade");
		
		//필터를 mapping에 넣을수 있게 변환
		FilterProvider filters = new SimpleFilterProvider().addFilter("UserInfoV2",filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(userV2);
		// filter 적용
		mapping.setFilters(filters);
		
		return mapping;
	}
	
	
}
