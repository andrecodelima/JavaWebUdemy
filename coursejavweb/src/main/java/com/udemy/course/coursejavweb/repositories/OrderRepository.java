package com.udemy.course.coursejavweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.coursejavweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
	
}
