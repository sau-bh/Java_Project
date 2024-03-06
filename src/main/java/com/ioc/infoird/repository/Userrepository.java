package com.ioc.infoird.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ioc.infoird.model.UserLogin;

public interface Userrepository extends JpaRepository<UserLogin, Long> {
	
	

}
