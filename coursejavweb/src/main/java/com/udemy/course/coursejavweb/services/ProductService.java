package com.udemy.course.coursejavweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.course.coursejavweb.entities.Product;
import com.udemy.course.coursejavweb.repositories.ProductRepository;

//@Component // Registra a classe como componente do Spring
@Service // Registrando como serviço
public class ProductService {
	
	// declarando a dependencia do userrepository
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}
	
}
