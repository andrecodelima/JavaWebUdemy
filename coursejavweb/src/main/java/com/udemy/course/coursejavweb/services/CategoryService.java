package com.udemy.course.coursejavweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.course.coursejavweb.entities.Category;
import com.udemy.course.coursejavweb.repositories.CategoryRepository;

//@Component // Registra a classe como componente do Spring
@Service // Registrando como serviço
public class CategoryService {
	
	// declarando a dependencia do userrepository
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}
	
}
