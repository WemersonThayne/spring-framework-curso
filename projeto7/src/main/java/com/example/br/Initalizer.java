package com.example.br;

import java.util.List;

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
		
//		for (int i = 0; i < 1000; i++) {
//			saveRole("Admin",StatusRole.ATIVO);
//		}
//		
//		for (int i = 0; i < 1000; i++) {
//			saveRole("Aluno",StatusRole.INATIVO);
//		}
//	
		//Paginação 
//		PageRequest page = PageRequest.of(10,10);
//		Page<Role> roles = this.roleRepository.findAll(page);
//		for (Role role : roles) {
//			System.out.println(role.getName());
//		}
		
		
		saveRole("Admin",StatusRole.ATIVO);
		List<User> users = this.userRepository.findAll();
		for(User user: users) {
			System.out.println(user);
		}
	}
	
	public void saveRole(String name, StatusRole status) {
		Role role = new Role(name,status);
		saveUser("Wemerson","wemerson@gmail.com",role);
		//this.roleRepository.save(role);
	}
	
	public void saveUser(String name, String email, Role role) {
		this.userRepository.save(new User(name,email,role));
	}
}
