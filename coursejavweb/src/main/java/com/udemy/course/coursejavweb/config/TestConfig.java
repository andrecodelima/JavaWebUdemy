package com.udemy.course.coursejavweb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.udemy.course.coursejavweb.entities.User;
import com.udemy.course.coursejavweb.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
//Essa classe vai ter que ter uma dependencia do user repository

// Para salvar os dados voce usa a classe repository
// quando um servico depende de outro ela tem que ser fraca, desaclopada
			
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		// salvando no banco
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	} 
	
	
		
}
