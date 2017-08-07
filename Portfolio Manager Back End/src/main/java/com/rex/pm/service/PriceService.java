package com.rex.pm.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rex.pm.entities.Price;
import com.rex.pm.repository.PriceRepository;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Service
public class PriceService {
	
	@Autowired
	private PriceRepository priceRepository;

	public Price add(Price price) {
		return priceRepository.save(price);
	}
	
	public Price update(Price price) {
		return priceRepository.save(price);
	}
	
	public void delete(int id) {
		priceRepository.delete(id);
	}
	
	public Price query(int id) {
		return priceRepository.findOne(id);
	}
	
	/**
	 * calculate income
	 * @param price
	 * @return one price income
	 */
	public double earnings(Price price) {
		if (price.getOfferPrice() == 0) {
			return 0;
		}
		return price.getOfferPrice() - price.getBidPrice();
	}
	
	/**
	 * calculate total income between two date
	 * @param start
	 * @param end
	 * @return total income
	 */
	public double earnings(Date start, Date end) {
		List<Price> prices = priceRepository.getPriceBetween(start, end);
		double total = 0;
		for (Price price : prices) {
			total += earnings(price);
		}
		return total;
	}
}
