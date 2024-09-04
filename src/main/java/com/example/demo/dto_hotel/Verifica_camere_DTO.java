package com.example.demo.dto_hotel;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
//import java.util.Date;

public class Verifica_camere_DTO {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date data_inizio;
	private Date data_fine;
	public Date getData_inizio() {
		return data_inizio;
	}
	public void setData_inizio(Date data_inizio) {
		this.data_inizio = data_inizio;
	}
	public Date getData_fine() {
		return data_fine;
	}
	public void setData_fine(Date data_fine) {
		this.data_fine = data_fine;
	}
}
