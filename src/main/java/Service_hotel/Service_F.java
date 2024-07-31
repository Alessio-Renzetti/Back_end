package Service_hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity_hotel.Cliente;
import dto_hotel.Autenticazione_dto;

@Service

public class Service_F {
	@Autowired private clienteRepository ClienteRepostory;
public String registrazione(Autenticazione_dto autenticazione_dto) {
	Cliente utente_da_registrare = clienteRepository.findByUsername(autenticazione_dto.getUsername());
return "";	

}
}
