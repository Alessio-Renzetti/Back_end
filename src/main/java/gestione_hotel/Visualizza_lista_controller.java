package gestione_hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class Visualizza_lista_controller {	
	
@Autowired private Visualizza_lista_controller  visualizza_lista_controller;
	
	@RequestMapping  (value="/home")
	public String info() {
		
		
		
		return "non so";
	
	
	}
	
	
	
	

}
