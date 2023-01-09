package com.udemy.course.coursejavweb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.course.coursejavweb.entities.Order;
import com.udemy.course.coursejavweb.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	//colocando uma dependencia para o service
	@Autowired  
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
//		Order u = new Order(1l, "Gerson Araújo", "gerson22@gmail.com", "21-98000-5454", "12345678");
//		return ResponseEntity.ok().body(u);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findByid(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
