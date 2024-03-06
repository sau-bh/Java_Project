package com.ioc.infoird.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ioc.infoird.model.UserLogin;
import com.ioc.infoird.repository.Userrepository;

@Service
public class UserService {
	
@Autowired	
Userrepository obj ;

public UserLogin saveClient(UserLogin user) {
	return obj.save(user);
	
}

public List<UserLogin> getAllUser() {
	return obj.findAll();
}






}
