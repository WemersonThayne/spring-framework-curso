package com.example.br.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.br.model.User;
import com.example.br.repository.UserRepository;

@Component
public class DataInitilizer implements ApplicationListener<ContextRefreshedEvent> {


	@Autowired
	private UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<User> users = userRepository.findAll();
		System.out.println(users);
		if(users.isEmpty()) {
			createUser("Wemerson", "wemerson@gmail.com");
			createUser("Maria", "maria@gmail.com");
			createUser("Jose", "jose@gmail.com");
			createUser("Manuel", "manu@gmail.com");
		}
	
		/* Consultando por Id especifico*/
		//User user = userRepository.getOne(2L);
		
		/* Deletando por Id especifico*/
		//userRepository.deleteById(1L);
		
		/* Update user*/
		//user.setName("Maria Update");
		//userRepository.save(user);
		
		User user2 = userRepository.findByName("Wemerson");
		User user3 = userRepository.findByEmail("maria@gmail.com");
		System.out.println(user2);
		System.out.println(user3);
	}
	
	private void createUser(String name, String email) {
		userRepository.save(new  User(name,email));
	}

}
