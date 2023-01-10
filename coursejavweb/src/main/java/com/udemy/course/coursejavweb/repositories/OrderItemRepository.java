package com.udemy.course.coursejavweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.coursejavweb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
	
}
