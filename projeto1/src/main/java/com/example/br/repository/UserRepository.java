package com.example.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.br.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);
	User findByNameIgnoreCase(String name);
	User findByEmail(String email);
	
	
}