package com.jpaspecification.service;

import com.jpaspecification.entity.User;
import com.jpaspecification.entity.User_;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public static Specification<User> getUserByFirstName(String firstname){
		
		return (root, query, CriteriaBuilder)-> CriteriaBuilder.equal(root.get(User_.firstName),firstname);
		
	}

}
