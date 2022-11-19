package com.juanprimeiroprojeto.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.juanprimeiroprojeto.curso.entites.User;
import com.juanprimeiroprojeto.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private UserRepository UserRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Juan Carlos","juancarlos@gmail.com", "987337905", "123456");
		User u2 = new User(null, "Evellyn Pereira","veve@gmail.com", "988883614", "123456");
		
		UserRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
	
}
