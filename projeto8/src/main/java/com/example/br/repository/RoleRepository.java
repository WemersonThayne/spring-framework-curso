package com.example.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.br.entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Long>{

}
