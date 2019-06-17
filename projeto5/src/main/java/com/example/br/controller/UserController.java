package com.example.br.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.br.model.User;

@RestController
public class UserController {

	@RequestMapping(value= "user/{name}", method= RequestMethod.GET)
	public  List<User> getUsers(@PathVariable String name) {
		List<User> users = new ArrayList<>();
		users.add(new User("Wemerson","wemerson@gmail.com"));
		users.add(new User("Maria","maria@gmail.com"));
		users.add(new User("Jose","jose@gmail.com"));
		users.add(new User(name,name+"@gmail.com"));
		return users;
	}
	
	@RequestMapping(value= "user", method= RequestMethod.POST)
	public User setUser(@RequestBody User user) {
		return user;
	}
}
