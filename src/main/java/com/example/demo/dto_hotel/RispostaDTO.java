package com.example.demo.dto_hotel;

public class RispostaDTO {

    private String messaggio;

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public RispostaDTO(String messaggio) {
        this.messaggio = messaggio;
    }
}
