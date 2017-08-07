package com.rex.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.FundManager;
import com.rex.pm.repository.FundManagerRepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class FundManagerService {
	
	@Autowired
	private FundManagerRepository fundManagerRepository;

	public FundManager add(FundManager bond) {
		return fundManagerRepository.save(bond);
	}
	
	public FundManager update(FundManager bond) {
		return fundManagerRepository.save(bond);
	}
	
	public void delete(int id) {
		fundManagerRepository.delete(id);
	}
	
	public FundManager query(int id) {
		return fundManagerRepository.findOne(id);
	}
}
