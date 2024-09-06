package com.example.demo.Controller_hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Service_hotel.Service_T;
import com.example.demo.dto_hotel.Prenotazione_camere_DTO;

@Controller
public class Controller_T {
	
	@Autowired private Service_T service_T;
	//private inserisci_prenotazione_controller inserisci_registrazione;

	@PostMapping("/inserisci")
	@CrossOrigin(origins = "*")
	@ResponseBody
	private String inserisci_prenotazione(@RequestBody Prenotazione_camere_DTO prenotazione_camere_dto) {
		
		String risposta = service_T.inserisci_prenotazione(prenotazione_camere_dto);
		return "";
	}
}

