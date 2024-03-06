package com.ioc.infoird.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserLogin {
	private String username;
	private String password;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public UserLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public UserLogin() {}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	

}
