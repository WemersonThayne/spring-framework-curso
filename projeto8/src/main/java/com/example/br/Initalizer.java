package com.example.br;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.br.entity.Role;
import com.example.br.entity.User;
import com.example.br.repository.RoleRepository;
import com.example.br.repository.UserRepository;

@Component
public class Initalizer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
	}
	
	public void saveRole(String name) {
		
	}
	
	public void saveUser(String name, String email, List<Role> role) {
		this.userRepository.save(new User(name,email,role));
	}
}
