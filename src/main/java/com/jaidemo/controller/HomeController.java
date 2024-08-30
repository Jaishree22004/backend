package com.jaidemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jaidemo.DTO.Users;

@RestController
public class HomeController {

//	@GetMapping("/users")
//	public String getUser() {
//		return "Hi Spring boot";
//	}
//	@GetMapping("/mark")
//	public int addMark(@RequestParam("a")int op1, @RequestParam("b") int op2) {
//		return op1+op2;
//	}
//	@GetMapping("/sub")
//	public int subtraction(@RequestParam("a")int op1, @RequestParam("b") int op2) {
//		return op1-op2;
//	}
////	pathvariable
//	@GetMapping("/multiply/{a}/{b}")
//	public int multiply(@PathVariable("a")int op1, @PathVariable("b") int op2) {
//		return op1*op2;
//	}
//}

	
	@PostMapping("/save")
	public String saveUserData(@RequestBody Users users) {
		if(users.getUserName().equals("Deepak")) {
			return"Valid userName";
		}
		return "Invalid user";
		
	}
	}