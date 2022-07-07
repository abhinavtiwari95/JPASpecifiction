package com.jpaspecification.repo;

import com.jpaspecification.entity.User;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User>{
	
	

}
