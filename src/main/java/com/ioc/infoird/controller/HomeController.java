package com.ioc.infoird.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ioc.infoird.model.UserLogin;
import com.ioc.infoird.repository.Userrepository;
import com.ioc.infoird.service.UserService;

@RequestMapping("/Home")
@RestController


public class HomeController {
	
@Autowired	
UserService obj ;
	
	@GetMapping( "/product")
	public  String display() {
		
		return "saurabh";
		
	}
	@PostMapping("/UserCreated")
	public UserLogin savemethod (@RequestBody UserLogin ser) {
		return obj.saveClient(ser);
		
	}
	
	@GetMapping("/GetAlluser")
	public List<UserLogin> getAllUserlist(){
		return obj.getAllUser();
		
	}


}
