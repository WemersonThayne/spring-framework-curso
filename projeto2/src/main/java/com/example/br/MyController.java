package com.example.br;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		System.out.println("Entrou no método...");
		return "Hello";
	}
}
