package com.jpaspecification.repo;

import java.util.List;

import com.jpaspecification.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User>{
	
	List<User> findByFirstname(String firstName);

}
