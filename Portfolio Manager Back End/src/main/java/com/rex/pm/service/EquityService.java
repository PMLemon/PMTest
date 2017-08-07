package com.rex.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.Equity;
import com.rex.pm.repository.EquityRepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class EquityService {

	@Autowired
	private EquityRepository equityRepository;
	
	/**
	 * create equity
	 * @param equity
	 * @return equity or null
	 */
	public Equity add(Equity equity) {
		return equityRepository.save(equity);
	}
	
	/**
	 * update equity
	 * @param equity
	 * @return equity or null
	 */
	public Equity update(Equity equity) {
		return equityRepository.save(equity);
	}
	
	/**
	 * delete equity
	 * @param id
	 */
	public void delete(int id) {
		equityRepository.delete(id);
	}
	
	/**
	 * find equity by id
	 * @param id
	 * @return equity or null
	 */
	public Equity query(int id) {
		return equityRepository.findOne(id);
	}
}
