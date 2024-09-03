package com.example.demo.Controller_hotel;

import com.example.demo.dto_hotel.RispostaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service_hotel.Service_F;
import com.example.demo.dto_hotel.Autenticazione_dto;
import com.example.demo.dto_hotel.Registrazione_dto;

@Controller
//@RequestMapping(value="flavio")

public class Controller_F {
	@Autowired private Service_F service_F;
	
	@PostMapping("/registrati")
	@CrossOrigin(origins = "*")
	@ResponseBody
	private RispostaDTO registrazione(@RequestBody Autenticazione_dto autenticazione_dto) {
		
<<<<<<< HEAD
		return service_F.registrazione(autenticazione_dto);	}
	
	
	@PostMapping("/autenticati")
	@CrossOrigin(origins = "*")
	@ResponseBody
	private String autenticazione(@RequestBody Registrazione_dto registrazione_dto) {
		return service_F.autenticazione(registrazione_dto);
=======
		RispostaDTO risposta = new RispostaDTO(service_F.registrazione(autenticazione_dto));
		return risposta;

>>>>>>> d64e2686e858b786b56d46c9aa2b33d96e8fc1d8
	}
}
