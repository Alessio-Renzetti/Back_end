package gestione_hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class Gestione_hotel_controller {
	
	@Autowired private Gestione_hotel_service gestione_hotel_service;
	
	@RequestMapping  (value="/home")
	public String info() {
		
		
		
		return "non so";
	
	
	}
}
