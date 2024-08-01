package com.example.demo.Entity_hotel;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Prenotazione {

 
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="	id_prenotazione")
	    private Long 	id_prenotazione;

	    @ManyToOne
	    @JoinColumn(name="FK_cliente")
	    private Cliente cliente ;

	    @Column(name="data_inizio")
	    private String data_inizio;
	    
	    @Column(name="data_fine")
	    private Integer data_fine;
	    
	    @Column(name="	pagato")
	    private Integer pagato;
	    
	    @Column(name="password_CL")
	    private Integer password_CL;

	    // Costruttori, getter e setter

	    public Prenotazione() {
	    	
	    }

		public Long getId_prenotazione() {
			return id_prenotazione;
		}

		public Cliente getFK_cliente() {
			return cliente;
		}

		public String getData_inizio() {
			return data_inizio;
		}

		public Integer getData_fine() {
			return data_fine;
		}

		public Integer getPagato() {
			return pagato;
		}

		public Integer getPassword_CL() {
			return password_CL;
		}

		public void setId_prenotazione(Long id_prenotazione) {
			this.id_prenotazione = id_prenotazione;
		}

		public void setFK_cliente(Cliente fK_cliente) {
			cliente = fK_cliente;
		}

		public void setData_inizio(String data_inizio) {
			this.data_inizio = data_inizio;
		}

		public void setData_fine(Integer data_fine) {
			this.data_fine = data_fine;
		}

		public void setPagato(Integer pagato) {
			this.pagato = pagato;
		}

		public void setPassword_CL(Integer password_CL) {
			this.password_CL = password_CL;
		}

}