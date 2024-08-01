package com.example.demo.Entity_hotel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="servizi")
public class Servizi {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_servizio")
	private Long id_servizio;
	
	@Column(name="nome_servizio")
	private String nome_servizio;
	
	@Column(name="costo_servizio")
	private Integer costo_servizio;
	
	@Column(name="n_max_posti")
	private Integer n_max_posti;
	
	public Servizi(String nome_servizio, Integer costo_servizio, Integer n_max_posti) {
		this.nome_servizio=nome_servizio;
		this.costo_servizio=costo_servizio;
		this.n_max_posti=n_max_posti;
		
	}

	public Long getId_servizio() {
		return id_servizio;
	}

	public void setId_servizio(Long id_servizio) {
		this.id_servizio = id_servizio;
	}

	public String getNome_servizio() {
		return nome_servizio;
	}

	public void setNome_servizio(String nome_servizio) {
		this.nome_servizio = nome_servizio;
	}

	public Integer getCosto_servizio() {
		return costo_servizio;
	}

	public void setCosto_servizio(Integer costo_servizio) {
		this.costo_servizio = costo_servizio;
	}

	public Integer getN_max_posti() {
		return n_max_posti;
	}

	public void setN_max_posti(Integer n_max_posti) {
		this.n_max_posti = n_max_posti;
	}
}