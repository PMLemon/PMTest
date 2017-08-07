package com.rex.pm.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.User;
import com.rex.pm.repository.UserRepository;

/** 
* @author Curry
* @date Apr 2, 2017
* @version 0.1
*/
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * user login
	 * @param username
	 * @param password
	 * @return login user or null
	 */
	public User login(String username, String password){
		return userRepository.findByUsernameAndPassword(username, password);
	}

	/**
	 * get user by id
	 * @param id
	 * @return user or null
	 */
	public User findOne(int id){
		return userRepository.findOne(id);
	}
	
	/**
	 * get user by name
	 * @param name
	 * @return user or null
	 */
	public User findOne(String name){
		return userRepository.findByName(name);
	}
	
	/**
	 * get all user
	 * @return user list or null
	 */
	public List<User> find(){
		return userRepository.findAll();
	}
	
	/**
	 * sort by name
	 * @return user list
	 */
	public List<User> sortByName(){
		return userRepository.findAllOrderByName();
	}
	
	/**
	 * create a user
	 * @param user
	 * @return the user be created or null
	 */
	public User add(User user){
		return userRepository.save(user);
	}
	
	/**
	 * update a user
	 * @param user
	 * @return the user be updated or null
	 */
	public User update(User user){
		return userRepository.save(user);
	}
	
	/**
	 * delete user by id
	 * @param id
	 */
	public void delete(int id){
		userRepository.delete(id);
	}
}
