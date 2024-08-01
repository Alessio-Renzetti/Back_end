package com.example.demo.Service_hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity_hotel.Cliente;
import com.example.demo.Repository.ClienteRepository;
import com.example.demo.dto_hotel.CredenzialiUtente;


@Service
public class Prenotazioni_service {

	@Autowired  ClienteRepository clienterepository;
	//@Autowired Prenotazionirepository prenotazionirepository;
	
	public String visualizza_lista(CredenzialiUtente credenzialiUtente) {
		Cliente cliente_autenticato = clienterepository.findByUsernameAndPassword(credenzialiUtente.getUsername(), credenzialiUtente.getPassword());
		
		
		
		
		return null;}
	
	
	public String modifica_Prenotazione(){
		return null;}
	
	
	public String elimina_Prenotazione() {
		return null;}
}
	
	

