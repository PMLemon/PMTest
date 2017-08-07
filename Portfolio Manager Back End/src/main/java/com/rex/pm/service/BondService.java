package com.rex.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.Bond;
import com.rex.pm.repository.BondRepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class BondService {
	
	@Autowired
	private BondRepository bondRepository;

	public Bond add(Bond bond) {
		return bondRepository.save(bond);
	}
	
	public Bond update(Bond bond) {
		return bondRepository.save(bond);
	}
	
	public void delete(int id) {
		bondRepository.delete(id);
	}
	
	public Bond query(int id) {
		return bondRepository.findOne(id);
	}
}
