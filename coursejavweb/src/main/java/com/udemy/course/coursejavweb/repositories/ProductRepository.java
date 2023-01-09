package com.udemy.course.coursejavweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.coursejavweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
	
}
