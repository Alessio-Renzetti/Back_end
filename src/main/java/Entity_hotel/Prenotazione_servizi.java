package Entity_hotel;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="prenotazione_servizi")
public class Prenotazione_servizi {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_prenotazione_servizio")
	private Long id_prenotazione_serizio;
	
	@Column(name="data_servizio")
	private Date data_servizio;
	
	@Column(name="n_persone")
	private Integer n_persone;
	
	@ManyToOne
    @JoinColumn(name = "FK_servizi")
    private Servizi servizi;

	@ManyToOne
    @JoinColumn(name = "FK_prenotazione")
    private Prenotazione prenotazione;
	
	public Prenotazione_servizi(Date data_servizio, Integer n_persone) {
		this.data_servizio=data_servizio;
		this.n_persone=n_persone;
	}

	public Long getId_prenotazione_serizio() {
		return id_prenotazione_serizio;
	}

	public void setId_prenotazione_serizio(Long id_prenotazione_serizio) {
		this.id_prenotazione_serizio = id_prenotazione_serizio;
	}

	public Date getData_servizio() {
		return data_servizio;
	}

	public void setData_servizio(Date data_servizio) {
		this.data_servizio = data_servizio;
	}

	public Integer getN_persone() {
		return n_persone;
	}

	public void setN_persone(Integer n_persone) {
		this.n_persone = n_persone;
	}
	
	

}
