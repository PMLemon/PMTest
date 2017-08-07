package com.rex.pm.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.Portfolio;
import com.rex.pm.repository.PortfolioRepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class PortfolioService {
	
	@Autowired
	private PortfolioRepository portFolioRepository;
	@Autowired
	private PriceService priceService;

	public Portfolio add(Portfolio bond) {
		return portFolioRepository.save(bond);
	}
	
	public Portfolio update(Portfolio bond) {
		return portFolioRepository.save(bond);
	}
	
	public void delete(int id) {
		portFolioRepository.delete(id);
	}
	
	public Portfolio query(int id) {
		return portFolioRepository.findOne(id);
	}
	
	public double earnings(Portfolio portfolio) {
		return priceService.earnings(portfolio.getPosition().getSecurity().getPrice());
	}
	
	public double earnings(Date start, Date end) {
		return priceService.earnings(start, end);
	}
}
