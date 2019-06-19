package com.example.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.br.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User WHERE u.name like %?1%")
	User findByName(String name);
	User findByEmail(String email);
}
