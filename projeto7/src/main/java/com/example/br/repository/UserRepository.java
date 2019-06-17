package com.example.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.br.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
