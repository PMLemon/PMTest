package com.rex.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.ETF;
import com.rex.pm.repository.ETFRepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class ETFService {
	
	@Autowired
	private ETFRepository etfRepository;

	public ETF add(ETF etf) {
		return etfRepository.save(etf);
	}
	
	public ETF update(ETF etf) {
		return etfRepository.save(etf);
	}
	
	public void delete(int id) {
		etfRepository.delete(id);
	}
	
	public ETF query(int id) {
		return etfRepository.findOne(id);
	}
}
