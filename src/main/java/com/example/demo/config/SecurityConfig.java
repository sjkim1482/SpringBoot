package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	//시큐리티 적용안받게 처리
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//이 뒤에는 적용 안받게
		http.authorizeRequests().antMatchers("/h2-console/**").permitAll();
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
		throws Exception {
		auth.inMemoryAuthentication().withUser("sjKim")
									 .password("{noop}test1234")
									 .roles("USER");
	}
	
}
