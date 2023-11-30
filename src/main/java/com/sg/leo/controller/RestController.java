package com.sg.leo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.sg.leo.domain.User;

@org.springframework.web.bind.annotation.RestController

public class RestController {
	@GetMapping("/jblog")
	public User httpGet() {
		User finduser = User.builder().id(1).username("ai").password("1016").email("ai@g.shingu.ac.kr").build();
		return finduser;
	}
	
	@PostMapping("/jblog")
	public String httpPost() {
		return "jblog POSTMapping";
	}
	
	@PutMapping("/jblog")
	public String httpPut() {
		return "jblog POSTMapping";
	}
	
	@DeleteMapping("/jblog")
	public String httpDelete() {
		return "jblog DeleteMapping";
	}

}
