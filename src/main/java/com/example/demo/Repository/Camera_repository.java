package com.example.demo.Repository;


import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity_hotel.Camera;

@Repository
public interface Camera_repository extends JpaRepository<Camera, Long>{

	@Query(value = "select c from Camera c where id = :id_camera ")
	public List<Camera> trova_camera_per_id(Long id_camera);

}
