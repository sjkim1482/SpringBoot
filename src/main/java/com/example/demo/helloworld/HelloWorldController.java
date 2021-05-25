package com.example.demo.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
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
	
	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language",required = false)Locale locale) {
		return messageSource.getMessage("greeting.message", null,locale);
	}
	
}
