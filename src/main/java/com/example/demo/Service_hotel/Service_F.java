package com.example.demo.Service_hotel;

import com.example.demo.Entity_hotel.Prenotazione;
import com.example.demo.Entity_hotel.PrenotazioneCamera;
import com.example.demo.Repository.PrenotazioneCamera_repository;
import com.example.demo.Repository.Prenotazionirepository;
import com.example.demo.dto_hotel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity_hotel.Cliente;
import com.example.demo.Repository.ClienteRepository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service

public class Service_F {
	@Autowired private ClienteRepository clienteRepository;
	@Autowired private Prenotazionirepository prenotazionirepository;
	@Autowired private PrenotazioneCamera_repository prenotazioneCameraRepository;

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
	Cliente cliente = clienteRepository.findByUsernameAndPassword(autenticazione_dto.getUsername(), autenticazione_dto.getPassword());
	List<Prenotazione> prenotazione = prenotazionirepository.trovaPerCliente(cliente.getId_cliente());
	List<Prenotazioni_cliente_DTO> prenotazioniCliente= new ArrayList<Prenotazioni_cliente_DTO>();
	for (int i=0; i<prenotazione.size();i++){
		Long id =prenotazione.get(i).getId_prenotazione();
		List<PrenotazioneCamera> prenotazioneCamera = prenotazioneCameraRepository.camere_cliente(id);
		for (int j=0; j<prenotazioneCamera.size();j++) {
			prenotazioniCliente.add(new Prenotazioni_cliente_DTO(prenotazioneCamera.get(j).getPrenotazione().getData_inizio(), prenotazioneCamera.get(j).getPrenotazione().getData_fine(), prenotazioneCamera.get(j).getCamera().getNome_camera(),prenotazioneCamera.get(j).getCamera().getPrezzi_tipo_camera())) ;
		}
	}
	String nome = cliente.getNome_cliente();
	String cognome = cliente.getCognome_cliente();
	Date data_nascita = cliente.getData_nascita();

	Pagina_profilo_DTO pagina_profilo_DTO = new Pagina_profilo_DTO();
	pagina_profilo_DTO.setInformazioniUtenteDTO(new InformazioniUtenteDTO(nome, cognome, data_nascita));
	pagina_profilo_DTO.setPrenotazioniClienteDto(prenotazioniCliente);

	return pagina_profilo_DTO;
}
}
