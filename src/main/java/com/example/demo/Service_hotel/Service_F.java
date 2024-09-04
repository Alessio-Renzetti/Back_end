package com.example.demo.Service_hotel;

import com.example.demo.dto_hotel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity_hotel.Cliente;
import com.example.demo.Repository.ClienteRepository;

import java.sql.Date;

@Service

public class Service_F {
	@Autowired private ClienteRepository clienteRepository;

public RispostaDTO registrazione(Registrazione_dto registrazione_dto) {
	Cliente utente_da_registrare = clienteRepository.findByUsername(registrazione_dto.getUsername());
	if (utente_da_registrare==null) {
		// username valido
		utente_da_registrare = new Cliente(registrazione_dto.getUsername(), registrazione_dto. getNome(),registrazione_dto.getCognome(),
				registrazione_dto.getData_di_nascita(),registrazione_dto.getPassword() );
		clienteRepository.save(utente_da_registrare);
		return null; // OK
	}
	else {

		return null; // Errore

	}

}
public Pagina_profilo_DTO autenticazione(Autenticazione_dto autenticazione_dto) {
	// TODO Auto-generated method stub
	Cliente cliente = clienteRepository.findByUsernameAndPassword(autenticazione_dto.getUsername(), autenticazione_dto.getPassword());

	String nome = cliente.getNome_cliente();
	String cognome = cliente.getCognome_cliente();
	Date data_nascita = cliente.getData_nascita();
	Pagina_profilo_DTO pagina_profilo_DTO = new Pagina_profilo_DTO();
	pagina_profilo_DTO.setInformazioniUtenteDTO(new InformazioniUtenteDTO(nome, cognome, data_nascita));


	return pagina_profilo_DTO;
}
}
