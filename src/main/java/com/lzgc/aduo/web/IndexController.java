package com.lzgc.aduo.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	@GetMapping("/login")
	public String index() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(String username,String password) {
		if(username != null && password != null) {
			UsernamePasswordToken token = new UsernamePasswordToken(username,password,false);  
	        Subject currentUser = SecurityUtils.getSubject(); 
	        currentUser.login(token); 
		}
		return null;
	}
	
	@GetMapping("/index")
	public String index1() {
		return "index";
	}
}
