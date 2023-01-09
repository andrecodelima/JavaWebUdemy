package com.udemy.course.coursejavweb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.course.coursejavweb.entities.User;
import com.udemy.course.coursejavweb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//colocando uma dependencia para o service
	@Autowired  
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
//		User u = new User(1l, "Gerson Araújo", "gerson22@gmail.com", "21-98000-5454", "12345678");
//		return ResponseEntity.ok().body(u);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findByid(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
