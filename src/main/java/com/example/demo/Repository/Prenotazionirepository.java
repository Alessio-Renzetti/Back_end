package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity_hotel.Cliente;
import com.example.demo.Entity_hotel.Prenotazione;

@Repository
public interface Prenotazionirepository extends JpaRepository<Prenotazione, Long> {

	@Query("select pr from Prenotazione pr")
	public List<Prenotazione> trovaTutti();
	
	@Query("select pr from Prenotazione pr where pr.Cliente.id_cliente = :id_cliente")
	public List<Prenotazione> trovaPerCliente(Long id_cliente);
}
