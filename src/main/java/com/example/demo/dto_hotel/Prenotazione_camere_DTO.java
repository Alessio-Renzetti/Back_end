package com.example.demo.dto_hotel;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

public class Prenotazione_camere_DTO {
	private String username;
	private String password;
	private Date data_inizio;
	private Date data_fine;
	private HashMap<Long, Long> numero_camere; 
	
	public Prenotazione_camere_DTO() {
	}
	
	public Prenotazione_camere_DTO(String username, String password, Date data_inizio, Date data_fine,
			HashMap<Long,Long> numero_camere) {
		this.username = username;
		this.password = password;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.numero_camere = numero_camere;
	}


	public Date getData_inizio() {
		return data_inizio;
	}
	public Date getData_fine() {
		return data_fine;
	}
	
	
	public void setData_inizio(Date data_inizio) {
		this.data_inizio = data_inizio;
	}
	public void setData_fine(Date data_fine) {
		this.data_fine = data_fine;
	}
	


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public HashMap<Long, Long> getNumero_camere() {
		return numero_camere;
	}

	public void setNumero_camere(HashMap<Long, Long> numero_camere) {
		this.numero_camere = numero_camere;
	}
}
