package Entity_hotel;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id_cliente")
	    private Long id_cliente;

	    @Column(name="username_CL")
	    private String username_CL;

	    @Column(name="nome_cliente")
	    private String nome_cliente;
	    
	    @Column(name="cognome_cliente")
	    private Integer cognome_cliente;
	    
	    @Column(name="data_nascita")
	    private Integer data_nascita;
	    
	    @Column(name="password_CL")
	    private Integer password_CL;

	    // Costruttori, getter e setter

	    public Cliente() {
	    }

		public Long getId_cliente() {
			return id_cliente;
		}

		public String getUsername_CL() {
			return username_CL;
		}

		public String getNome_cliente() {
			return nome_cliente;
		}

		public Integer getCognome_cliente() {
			return cognome_cliente;
		}

		public Integer getData_nascita() {
			return data_nascita;
		}

		public Integer getPassword_CL() {
			return password_CL;
		}

		public void setId_cliente(Long id_cliente) {
			this.id_cliente = id_cliente;
		}

		public void setUsername_CL(String username_CL) {
			this.username_CL = username_CL;
		}

		public void setNome_cliente(String nome_cliente) {
			this.nome_cliente = nome_cliente;
		}

		public void setCognome_cliente(Integer cognome_cliente) {
			this.cognome_cliente = cognome_cliente;
		}

		public void setData_nascita(Integer data_nascita) {
			this.data_nascita = data_nascita;
		}

		public void setPassword_CL(Integer password_CL) {
			this.password_CL = password_CL;
		}

	    //public Cliente (Long id_cliente, String username_CL) {
	      //  this.id_cliente = id_cliente;
	        //this.username_CL = username_CL;
	    //}
	
		
		
}

