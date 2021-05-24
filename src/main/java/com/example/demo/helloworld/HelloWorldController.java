package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	// GET
	// hello -> (endpoint)
	// @RequestMapping()
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "hello";
	}
	
	@GetMapping(path = "/hello-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("hello");
	}
	
	@GetMapping(path = "/hello-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("hello, %s",name));
	}
	
}
