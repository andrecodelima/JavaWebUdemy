package com.udemy.course.coursejavweb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.course.coursejavweb.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1l, "Gerson Araújo", "gerson22@gmail.com", "21-98000-5454", "12345678");
		return ResponseEntity.ok().body(u);
	}
	
	
}
