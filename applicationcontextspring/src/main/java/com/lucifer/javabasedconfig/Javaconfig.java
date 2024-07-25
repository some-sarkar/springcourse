package com.lucifer.javabasedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Javaconfig {
	
	@Autowired
	Laptop laptop;
	
	@Bean
	public Alien alien() {
		Alien alien = new Alien();
		alien.setAge(18);
		alien.setLaptop(laptop);
		return alien;
	}
	
	@Bean
	public Laptop laptop() {
		Laptop laptop = new Laptop(1002, 10000001);		
		return laptop;
	}
	
	
	
}
