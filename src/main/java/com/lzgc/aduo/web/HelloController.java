package com.lzgc.aduo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzgc.aduo.entity.PropertiesConfig;

@RestController
public class HelloController {
	
	
	private @Autowired PropertiesConfig propertiesConfig;
	
	@GetMapping("/sayhello")
	public String sayhello() {
		return "hello springboot2";
	}
	
	@GetMapping("/test")
	public String test() {
		return propertiesConfig.getToString();
	}
}
