package com.example.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.br.controller.MyController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.br.service", "com.example.br.controller"})
public class Projeto3Application {

	public static void main(String[] args) {
		ApplicationContext apctx = SpringApplication.run(Projeto3Application.class, args);
		
		MyController controller = (MyController) apctx.getBean("myController");
		controller.hello();
	}

}
