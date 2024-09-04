package com.example.demo.Entity_hotel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="camera")
public class Camera {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_camera")
	private Integer id;
	
	@Column(name="nome_camera")
	private String nome_camera;
	
	@Column(name="n_max_posti")
	private Integer n_max_posti;
	
	@Column(name="prezzo_tipo_camera")
	private Integer prezzo_tipo_camera;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome_camera() {
		return nome_camera;
	}

	public void setNome_camera(String nome_camera) {
		this.nome_camera = nome_camera;
	}

	public Integer getN_max_posti() {
		return n_max_posti;
	}

	public void setN_max_posti(Integer n_max_posti) {
		this.n_max_posti = n_max_posti;
	}

	public Integer getPrezzi_tipo_camera() {
		return prezzo_tipo_camera;
	}

	public void setPrezzi_tipo_camera(Integer prezzi_tipo_camera) {
		this.prezzo_tipo_camera = prezzo_tipo_camera;
	}
}
