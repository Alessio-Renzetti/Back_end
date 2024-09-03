package com.example.demo.dto_hotel;

import org.springframework.stereotype.Controller;

@Controller
public class Registrazione_dto {
	private String username;
	private String password;
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
	public Registrazione_dto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	

}
