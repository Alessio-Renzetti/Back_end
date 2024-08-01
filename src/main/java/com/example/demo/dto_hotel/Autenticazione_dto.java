package com.example.demo.dto_hotel;

import java.util.Date;

public class Autenticazione_dto {
	private String username;
	private String nome;
	private String cognome;
	private Date data_di_nascita;
	private String password;
	public String getUsername() {
		return username;
	}
	public Autenticazione_dto(String username, String nome, String cognome, Date data_di_nascita, String password) {
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
		this.data_di_nascita = data_di_nascita;
		this.password = password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getData_di_nascita() {
		return data_di_nascita;
	}
	public void setData_di_nascita(Date data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
