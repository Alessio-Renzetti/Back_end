package com.example.demo.Controller_hotel;

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
	private String registrazione(@RequestBody Autenticazione_dto autenticazione_dto) {
		
		return service_F.registrazione(autenticazione_dto);	}
	
	
	@PostMapping("/autenticati")
	@CrossOrigin(origins = "*")
	@ResponseBody
	private String autenticazione(@RequestBody Registrazione_dto registrazione_dto) {
		return service_F.autenticazione(registrazione_dto);
	}
}
