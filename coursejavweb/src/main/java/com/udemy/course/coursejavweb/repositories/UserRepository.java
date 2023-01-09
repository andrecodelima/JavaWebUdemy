package com.udemy.course.coursejavweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.coursejavweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
	
}
