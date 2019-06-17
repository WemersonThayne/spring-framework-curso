package com.example.br;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.br.entity.Role;
import com.example.br.entity.User;
import com.example.br.enums.StatusRole;
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

		Role r1 = new Role();
		r1.setName("Admin");
		r1.setStatus(StatusRole.ATIVO);
		Role r2 = new Role();
		r2.setName("Aluno");
		r2.setStatus(StatusRole.INATIVO);
		
		this.roleRepository.save(r1);
		this.roleRepository.save(r2);
		
		User user1 = new User();
		user1.setName("Wemerson");
		user1.setEmail("wemerson@gmail.com");
		user1.setRole(r1);
		
		this.userRepository.save(user1);
	}
}
