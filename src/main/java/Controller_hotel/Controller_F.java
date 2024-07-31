package Controller_hotel;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Service_hotel.Service_F;
import dto_hotel.Autenticazione_dto;

@Controller
//@RequestMapping(value="flavio")

public class Controller_F {
	@Autowired private Service_F service_F;
	
	@PostMapping(value="registrati")
	@ResponseBody
	private String registrazione(@RequestBody Autenticazione_dto autenticazione_dto) {
		
		return service_F.registrazione(autenticazione_dto);	}
}
