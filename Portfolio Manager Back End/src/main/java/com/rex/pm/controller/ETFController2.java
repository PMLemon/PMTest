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
import com.rex.pm.entities.ETF;
import com.rex.pm.service.ETFService;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ETFController2 {
	
	private Logger logger = LoggerFactory.getLogger(ETFController2.class);

	@Autowired
	private ETFService etfService;

	/**
	 * create etf
	 * @param etf
	 * @return the etf be created or null
	 */
	@PostMapping(value = "/etf")
	public ReturnData add(ETF etf) {
		ETF add = etfService.add(etf);
		if (add == null) {
			logger.info("create etf fail!");
			return new ReturnData(ReturnCode.FAIL, "create etf fail!", null);
		}
		logger.info("create etf success!");
		return new ReturnData(ReturnCode.SUCCESS, "create etf success!", add);
	}
	
	/**
	 * update etf
	 * @param etf
	 * @return the etf be updated or null
	 */
	@PutMapping(value = "/etf/{id}")
	public ReturnData update(ETF etf) {
		ETF update = etfService.update(etf);
		if (update == null) {
			logger.info("update etf fail!");
			return new ReturnData(ReturnCode.FAIL, "update etf fail!", null);
		}
		logger.info("update etf success!");
		return new ReturnData(ReturnCode.SUCCESS, "update etf success!", update);
	}
	
	/**
	 * delete etf
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/etf/{id}")
	public ReturnData delete(@PathVariable int id) {
		etfService.delete(id);
		logger.info("delete etf success!");
		return new ReturnData(ReturnCode.SUCCESS, "delete etf success!", null);
	}
	
	/**
	 * query etf
	 * @param id
	 * @return etf or null
	 */
	@GetMapping(value = "/etf/{id}")
	public ReturnData query(@PathVariable int id) {
		ETF etf = etfService.query(id);
		if (etf == null) {
			logger.info("query etf fail!");
			return new ReturnData(ReturnCode.FAIL, "query etf fail!", null);
		}
		logger.info("query etf success!");
		return new ReturnData(ReturnCode.SUCCESS, "query etf success!", etf);
	}
}
