package com.example.demo.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity_hotel.Camera;
import com.example.demo.Entity_hotel.PrenotazioneCamera;

@Repository
public interface PrenotazioneCamera_repository extends JpaRepository <PrenotazioneCamera ,Camera> {
//	@Query (value = "select pc.FK_camera "
//			+ "from Prenotazione p "
//			+ "left join PrenotazioneCamera pc on p.id_prenotazione = pc.FK_prenotazione "
//			+ "where (:data_inizio<=p.data_inizio and :data_fine>=p.data_fine) or (:data_inizio>=p.data_inizio and :data_fine<=p.data_fine)")

	@Query (value = "select pc "
			+ "from PrenotazioneCamera pc "
			+ "where (:data_inizio<=pc.Prenotazione.data_inizio and :data_fine>=pc.Prenotazione.data_fine) or (:data_inizio>=pc.Prenotazione.data_inizio and :data_fine<=pc.Prenotazione.data_fine)")
	public List<PrenotazioneCamera> verifica_disp(Date data_inizio, Date data_fine);

}
