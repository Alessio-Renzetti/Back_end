package com.example.demo.Entity_hotel;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name="prenotazione")
public class Prenotazione {

 
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id_prenotazione", nullable = false, unique = true)
	    private Long id_prenotazione;

	    @ManyToOne
	    @JoinColumn(name="FK_cliente")
	    private Cliente cliente ;

	    @Column(name="data_inizio")
	    private Date data_inizio;

	    @Column(name="data_fine")
	    private Date data_fine;
	    
	    @Column(name="	pagato")
	    private Integer pagato;

	// Costruttori, getter e setter


	public Prenotazione() {
	}

	public Prenotazione(Cliente cliente, Date data_inizio, Date data_fine, Integer pagato) {
		this.cliente = cliente;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.pagato = pagato;
	}

	public Long getId_prenotazione() {
		return id_prenotazione;
	}

	public void setId_prenotazione(Long id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

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

	public Integer getPagato() {
		return pagato;
	}

	public void setPagato(Integer pagato) {
		this.pagato = pagato;
	}
}