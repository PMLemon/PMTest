package com.rex.pm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rex.pm.entities.User;

/** 
* @author Curry
* @date Apr 2, 2017
* @version 0.1
*/
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);
	
	User findByUsernameAndPassword(String username, String password);
	
	@Transactional
	@Query("select u from User u where u.userType = 'FundManager' order by u.name")
	List<User> findAllOrderByName();
}
