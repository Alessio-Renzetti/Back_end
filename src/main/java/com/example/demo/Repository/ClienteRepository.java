package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity_hotel.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	@Query(value="SELECT cl FROM Cliente cl where username_CL = :username")
	public Cliente findByUsername(String username);
	
	@Query(value="SELECT cl FROM Cliente cl where username_CL = :username AND password_CL = :password")
	public Cliente findByUsernameAndPassword(String username, String password);
}
