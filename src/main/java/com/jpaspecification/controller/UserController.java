package com.jpaspecification.controller;

import java.util.List;
import static com.jpaspecification.service.UserService.*;

import com.jpaspecification.entity.User;
import com.jpaspecification.repo.UserRepository;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userrepository;
	

	
	@GetMapping("/search/{firstName}")
	public List<User> searchApi(@PathVariable String firstName) {
		
		List<User> getUserByFirstName = userrepository.findByFirstname(firstName);
		
		return getUserByFirstName;
	}



	
}
