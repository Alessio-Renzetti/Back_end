package com.example.demo.Service_hotel;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity_hotel.Camera;
import com.example.demo.Entity_hotel.Cliente;
import com.example.demo.Entity_hotel.Prenotazione;
import com.example.demo.Entity_hotel.PrenotazioneCamera;
import com.example.demo.Repository.Camera_repository;
import com.example.demo.Repository.ClienteRepository;
import com.example.demo.Repository.PrenotazioneCamera_repository;
import com.example.demo.Repository.Prenotazionirepository;
import com.example.demo.dto_hotel.Prenotazione_camere_DTO;

@Service
public class Service_T {
	@Autowired ClienteRepository clienteRepository;
	@Autowired Prenotazionirepository prenotazionirepository;
	@Autowired Camera_repository camera_repository;
	@Autowired PrenotazioneCamera_repository prenotazioneCamera_repository;
	
	public String inserisci_prenotazione(Prenotazione_camere_DTO prenotazione_camere_dto) {
		Cliente cliente = clienteRepository.findByUsernameAndPassword(prenotazione_camere_dto.getUsername(), prenotazione_camere_dto.getPassword());
		
		Prenotazione prenotazione_da_inserire = new Prenotazione(cliente, prenotazione_camere_dto.getData_inizio(), prenotazione_camere_dto.getData_fine(), 0);
		prenotazionirepository.save(prenotazione_da_inserire);
		
		for (Map.Entry<Long, Long> entry : prenotazione_camere_dto.getNumero_camere().entrySet()) {
			Long numero_camera = entry.getKey();
			Long numero_ospiti = entry.getValue();
			PrenotazioneCamera prenotazionecamera = new PrenotazioneCamera();
			
			Camera camera = camera_repository.trova_camera_per_id(numero_camera).get(0);
			prenotazionecamera.setCamera(camera);
			prenotazionecamera.setPrenotazione(prenotazione_da_inserire);
			prenotazionecamera.setN_ospiti(numero_ospiti);
			
			prenotazioneCamera_repository.save(prenotazionecamera);
		}

		return "";
	}

}
