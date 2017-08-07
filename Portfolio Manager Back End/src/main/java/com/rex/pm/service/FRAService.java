package com.rex.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.FRA;
import com.rex.pm.repository.FRARepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class FRAService {
	
	@Autowired
	private FRARepository fraRepository;

	public FRA add(FRA fra) {
		return fraRepository.save(fra);
	}
	
	public FRA update(FRA fra) {
		return fraRepository.save(fra);
	}
	
	public void delete(int id) {
		fraRepository.delete(id);
	}
	
	public FRA query(int id) {
		return fraRepository.findOne(id);
	}
}
