package com.example.demo.Controller_hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.Entity_hotel.Prenotazione;
import com.example.demo.Service_hotel.Prenotazioni_service;


@Controller
@RequestMapping(value="prenotazioni")
public class Prenotazioni_controller {
	
	@Autowired
	private Prenotazioni_service prenotazioniservice;
	
	
	@CrossOrigin(origins="*")
	@ResponseBody
	@RequestMapping(value="lista")
	public String visualizza_lista(@RequestBody ) {
		return null;
	}
	

	@CrossOrigin(origins="*")
	@ResponseBody
	@RequestMapping(value="modifica_prenotazione")
	public String modifica_Prenotazione() {
		return null;}
	
	
	@CrossOrigin(origins="*")
	@ResponseBody
	@RequestMapping(value="elimina_prenotazione")
	public String elimina_Prenotazione() {
		return null;}
}
