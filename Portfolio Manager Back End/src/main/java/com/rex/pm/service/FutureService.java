package com.rex.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.Future;
import com.rex.pm.repository.FutureRepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class FutureService {
	
	@Autowired
	private FutureRepository futureRepository;

	public Future add(Future future) {
		return futureRepository.save(future);
	}
	
	public Future update(Future future) {
		return futureRepository.save(future);
	}
	
	public void delete(int id) {
		futureRepository.delete(id);
	}
	
	public Future query(int id) {
		return futureRepository.findOne(id);
	}
}
