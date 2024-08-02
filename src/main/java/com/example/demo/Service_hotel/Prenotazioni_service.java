package com.example.demo.Service_hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity_hotel.Cliente;
import com.example.demo.Entity_hotel.Prenotazione;
import com.example.demo.Repository.ClienteRepository;
import com.example.demo.Repository.Prenotazionirepository;
import com.example.demo.dto_hotel.CredenzialiUtente;


@Service
public class Prenotazioni_service {

	@Autowired  ClienteRepository clienterepository;
	@Autowired Prenotazionirepository prenotazionirepository;
	
	public String visualizza_lista(CredenzialiUtente credenzialiUtente) {
		Cliente cliente_autenticato = clienterepository.findByUsernameAndPassword(credenzialiUtente.getUsername(), credenzialiUtente.getPassword());
		
		List<Prenotazione> prenotazioni_utente = prenotazionirepository.trovaPerCliente(cliente_autenticato.getId_cliente());
		
		
		return null;}
	
	
	public String modifica_Prenotazione(){
		return null;}
	
	
	public String elimina_Prenotazione() {
		return null;}
}
	
	

