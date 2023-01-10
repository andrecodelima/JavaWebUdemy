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
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	//Observe que não são todos os campos que foram colocados para serem atualizados, isso vai depender
	// da regra de negócio. 
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
		
	
	
}
