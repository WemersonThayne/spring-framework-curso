package com.example.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.br.entity.Role;
import com.example.br.enums.StatusRole;

public interface RoleRepository  extends JpaRepository<Role, Long>{

	List<Role> findRoleByStatus(StatusRole status);
}
