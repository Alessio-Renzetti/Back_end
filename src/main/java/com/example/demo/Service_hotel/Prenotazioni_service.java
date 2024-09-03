package com.example.demo.Service_hotel;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.demo.Entity_hotel.Cliente;
import com.example.demo.Entity_hotel.Prenotazione;
import com.example.demo.Entity_hotel.PrenotazioneCamera;
import com.example.demo.Repository.ClienteRepository;
import com.example.demo.Repository.PrenotazioneCamera_repository;
import com.example.demo.Repository.Prenotazionirepository;
import com.example.demo.dto_hotel.CredenzialiUtente;
import com.example.demo.dto_hotel.Verifica_camere_DTO;


@Service
public class Prenotazioni_service {

	@Autowired  ClienteRepository clienterepository;
	@Autowired Prenotazionirepository prenotazionirepository;
	@Autowired PrenotazioneCamera_repository prenotazioneCamera_repository; 
	
	public String visualizza_lista(CredenzialiUtente credenzialiUtente) {
		Cliente cliente_autenticato = clienterepository.findByUsernameAndPassword(credenzialiUtente.getUsername(), credenzialiUtente.getPassword());
		
		List<Prenotazione> prenotazioni_utente = prenotazionirepository.trovaPerCliente(cliente_autenticato.getId_cliente());
		//List<Prenotazione> prenotazioni = prenotazionirepository.trovaTutti();
		/*List<Prenotazione> prenotazioni_utente = prenotazioni.stream()
															.filter(pre -> pre.getFK_cliente() == cliente_autenticato)
															.collect(Collectors.toList());*/
		
		
		return null;}
	
		public String verifica_disponibilita(Verifica_camere_DTO verifica_camere) {
			List<PrenotazioneCamera> camere_occupate = prenotazioneCamera_repository.verifica_disp(verifica_camere.getData_inizio(), verifica_camere.getData_fine());
			return null;
		}
	
	
	public String modifica_Prenotazione(){
		return null;}
	
	
	public String elimina_Prenotazione() {
		return null;}
}
	
	

