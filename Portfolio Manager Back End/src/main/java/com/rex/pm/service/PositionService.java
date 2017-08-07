package com.rex.pm.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.Positions;
import com.rex.pm.repository.PositionRepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class PositionService {
	
	@Autowired
	private PositionRepository positionRepository;
	@Autowired
	private PriceService priceService;

	public Positions add(Positions bond) {
		return positionRepository.save(bond);
	}
	
	public Positions update(Positions bond) {
		return positionRepository.save(bond);
	}
	
	public void delete(int id) {
		positionRepository.delete(id);
	}
	
	public Positions query(int id) {
		return positionRepository.findOne(id);
	}
	
	public double earnings(Positions position) {
		return priceService.earnings(position.getSecurity().getPrice());
	}
	
	public double earnings(Date start, Date end) {
		return priceService.earnings(start, end);
	}
}
