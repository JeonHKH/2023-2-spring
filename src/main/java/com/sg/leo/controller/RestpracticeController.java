package com.sg.leo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")	//localhost:8080/api/
public class RestpracticeController {
	@RequestMapping("/hello")
	public String hello() {
		return "return from /hello, RestpracticeController, 10/23 by 전형기";
	}
	
	@GetMapping("/get")
	public String get() {
		return "return from /get, RestpracticeController, 10/16 by 전형기";
	}
	
	@GetMapping(value = "/getchk/{variable}")
	public String getchk(@PathVariable String variable) {
		return "return from /get, RestpracticeController, 10/16 by 전형기: " + variable;
	}
	
	@GetMapping(value="/getparam")
	public String getparam( String name, String email) {
		return "return from /getparm, name = " + name + "이메일주소는=" + email; 
	}
}

