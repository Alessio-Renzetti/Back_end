package com.example.demo.dto_hotel;

import java.util.List;

public class Pagina_profilo_DTO {
    private InformazioniUtenteDTO informazioniUtenteDTO;
    private List<Prenotazioni_cliente_DTO > prenotazioniClienteDto;

    public List<Prenotazioni_cliente_DTO> getPrenotazioniClienteDto(){return prenotazioniClienteDto;}
    public InformazioniUtenteDTO getInformazioniUtenteDTO() {
        return informazioniUtenteDTO;
    }

    public void setInformazioniUtenteDTO(InformazioniUtenteDTO informazioniUtenteDTO) {
        this.informazioniUtenteDTO = informazioniUtenteDTO;
    }
    public void setPrenotazioniClienteDto(List<Prenotazioni_cliente_DTO> prenotazioniClienteDto){
        this.prenotazioniClienteDto = prenotazioniClienteDto;
    }

}
