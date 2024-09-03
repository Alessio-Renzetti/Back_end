package com.example.demo.dto_hotel;

//import java.util.String;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class Autenticazione_dto {
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
	public Autenticazione_dto(String username, String password) {
//		super();
		this.username = username;
		this.password = password;
	}
	
	

}
