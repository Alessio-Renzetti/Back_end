package com.example.demo.dto_hotel;

import java.sql.Date;

public class Prenotazioni_cliente_DTO {
    private Date data_inizio;
    private Date data_fine;
    private Integer n_camera;
    private Integer prezzo;

    public Date getData_inizio() {
        return data_inizio;
    }

    public void setData_inizio(Date data_inizio) {
        this.data_inizio = data_inizio;
    }

    public Date getData_fine() {
        return data_fine;
    }

    public void setData_fine(Date data_fine) {
        this.data_fine = data_fine;
    }

    public Integer getN_camera() {
        return n_camera;
    }

    public void setN_camera(Integer n_camera) {
        this.n_camera = n_camera;
    }

    public Integer getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Integer prezzo) {
        this.prezzo = prezzo;
    }
    public Prenotazioni_cliente_DTO(Date data_inizio, Date data_fine, Integer n_camera, Integer prezzo) {
        this.data_inizio = data_inizio ;
        this.data_fine = data_fine;
        this.n_camera = n_camera;
        this.prezzo = prezzo;
    }
}
