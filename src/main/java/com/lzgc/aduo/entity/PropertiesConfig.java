package com.lzgc.aduo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesConfig {
	
	@Value("${test.user.username}")
	private String username;
	
	@Value("${test.user.age}")
	private Integer age;
	
	@Value("${test.user.toString}")
	private String toString;

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

	public String getToString() {
		return toString;
	}

	public void setToString(String toString) {
		this.toString = toString;
	}
	
}
