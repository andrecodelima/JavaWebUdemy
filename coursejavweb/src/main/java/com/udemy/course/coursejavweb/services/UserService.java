package com.udemy.course.coursejavweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.course.coursejavweb.entities.User;
import com.udemy.course.coursejavweb.repositories.UserRepository;

//@Component // Registra a classe como componente do Spring
@Service // Registrando como serviço
public class UserService {
	
	// declarando a dependencia do userrepository
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
}
