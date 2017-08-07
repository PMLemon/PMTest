package com.rex.pm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rex.pm.commons.Commons.ReturnCode;
import com.rex.pm.commons.ReturnData;
import com.rex.pm.entities.Price;
import com.rex.pm.service.PriceService;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PriceController {
	
	private Logger logger = LoggerFactory.getLogger(PriceController.class);

	@Autowired
	private PriceService priceService;

	/**
	 * create price
	 * @param price
	 * @return the price be created or null
	 */
	@PostMapping(value = "/price")
	public ReturnData add(Price price) {
		Price add = priceService.add(price);
		if (add == null) {
			logger.info("create price fail!");
			return new ReturnData(ReturnCode.FAIL, "create price fail!", null);
		}
		logger.info("create price success!");
		return new ReturnData(ReturnCode.SUCCESS, "create price success!", add);
	}
	
	/**
	 * update price
	 * @param price
	 * @return the price be updated or null
	 */
	@PutMapping(value = "/price/{id}")
	public ReturnData update(Price price) {
		Price update = priceService.update(price);
		if (update == null) {
			logger.info("update price fail!");
			return new ReturnData(ReturnCode.FAIL, "update price fail!", null);
		}
		logger.info("update price success!");
		return new ReturnData(ReturnCode.SUCCESS, "update price success!", update);
	}
	
	/**
	 * delete price
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/price/{id}")
	public ReturnData delete(@PathVariable int id) {
		priceService.delete(id);
		logger.info("delete price success!");
		return new ReturnData(ReturnCode.SUCCESS, "delete price success!", null);
	}
	
	/**
	 * query price
	 * @param id
	 * @return price or null
	 */
	@GetMapping(value = "/price/{id}")
	public ReturnData query(@PathVariable int id) {
		Price price = priceService.query(id);
		if (price == null) {
			logger.info("query price fail!");
			return new ReturnData(ReturnCode.FAIL, "query price fail!", null);
		}
		logger.info("query price success!");
		return new ReturnData(ReturnCode.SUCCESS, "query price success!", price);
	}
}
