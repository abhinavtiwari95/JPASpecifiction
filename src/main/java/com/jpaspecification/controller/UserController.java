package com.jpaspecification.controller;

import java.util.List;

import com.jpaspecification.entity.User;
import com.jpaspecification.repo.UserRepository;
import com.jpaspecification.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private UserService us;
	
	@GetMapping("/search")
	public void searchApi() {
		
		List<User> getUserByFirstName = userrepository.findAll(getUserByFirstName("Garima"));
		
		getUserByFirstName.forEach(System.out::println);
	}

	private Specification<User> getUserByFirstName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
