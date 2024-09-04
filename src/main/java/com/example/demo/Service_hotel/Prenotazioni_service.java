package com.example.demo.Service_hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.Entity_hotel.Camera;
import com.example.demo.Repository.Camera_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity_hotel.Cliente;
import com.example.demo.Entity_hotel.Prenotazione;
import com.example.demo.Entity_hotel.PrenotazioneCamera;
import com.example.demo.Repository.ClienteRepository;
import com.example.demo.Repository.PrenotazioneCamera_repository;
import com.example.demo.Repository.Prenotazionirepository;
//import com.example.demo.dto_hotel.CredenzialiUtente;
import com.example.demo.dto_hotel.Verifica_camere_DTO;



@Service
public class Prenotazioni_service {

	@Autowired  ClienteRepository clienterepository;
	@Autowired Prenotazionirepository prenotazionirepository;
	@Autowired PrenotazioneCamera_repository prenotazioneCamera_repository;
	@Autowired Camera_repository camera_repository;
	
//	public String visualizza_lista(CredenzialiUtente credenzialiUtente) {
//		Cliente cliente_autenticato = clienterepository.findByUsernameAndPassword(credenzialiUtente.getUsername(), credenzialiUtente.getPassword());
//
//		List<Prenotazione> prenotazioni_utente = prenotazionirepository.trovaPerCliente(cliente_autenticato.getId_cliente());
//
//
//		return null;}
	
		public List<Camera> verifica_disponibilita(Verifica_camere_DTO verifica_camere) {
			List<PrenotazioneCamera> app = prenotazioneCamera_repository.verifica_disp(verifica_camere.getData_inizio(), verifica_camere.getData_fine());
			List<Camera> tutte = camera_repository.findAll();
			List<Camera> camere_occupate = new ArrayList<Camera>();
			for (int i=0;i<  app.size();i++){
				camere_occupate.add(app.get(i).getCamera());
			}
			tutte.removeAll(camere_occupate);
			return tutte;
		}
	
	
	public String modifica_Prenotazione(){
		return null;}
	
	
	public String elimina_Prenotazione() {
		return null;}
}
	
	

