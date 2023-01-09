package com.udemy.course.coursejavweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.course.coursejavweb.entities.Order;
import com.udemy.course.coursejavweb.repositories.OrderRepository;

//@Component // Registra a classe como componente do Spring
@Service // Registrando como serviço
public class OrderService {
	
	// declarando a dependencia do Orderrepository
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}
	
}
