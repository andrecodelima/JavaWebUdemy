package com.udemy.course.coursejavweb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.course.coursejavweb.entities.Product;
import com.udemy.course.coursejavweb.services.ProductService;

@RestController
@RequestMapping(value = "/products") // Como a página vai ser chamada (Ex. Nomedapagina/users)
public class ProductResource {
	
	//colocando uma dependencia para o service
	@Autowired  
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
//		Product u = new Product(1l, "Gerson Araújo", "gerson22@gmail.com", "21-98000-5454", "12345678");
//		return ResponseEntity.ok().body(u);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findByid(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
