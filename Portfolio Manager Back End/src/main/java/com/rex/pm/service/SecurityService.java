package com.rex.pm.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.Security;
import com.rex.pm.repository.SecurityRepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class SecurityService {
	
	@Autowired
	private SecurityRepository securityRepository;
	@Autowired
	private PriceService priceService;

	public Security add(Security security) {
		return securityRepository.save(security);
	}
	
	public Security update(Security security) {
		return securityRepository.save(security);
	}
	
	public void delete(int id) {
		securityRepository.delete(id);
	}
	
	public Security query(int id) {
		return securityRepository.findOne(id);
	}
	
	public double earnings(Security security) {
		return priceService.earnings(security.getPrice());
	}
	
	public double earnings(Date start, Date end) {
		return priceService.earnings(start, end);
	}
}
