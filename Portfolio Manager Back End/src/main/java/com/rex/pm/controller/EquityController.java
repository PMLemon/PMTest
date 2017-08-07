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

import com.rex.pm.commons.ReturnData;
import com.rex.pm.commons.Commons.ReturnCode;
import com.rex.pm.entities.Equity;
import com.rex.pm.service.EquityService;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EquityController {
	
	private static final Logger logger = LoggerFactory.getLogger(EquityController.class);

	@Autowired
	private EquityService equityService;
	
	/**
	 * create equity
	 * @param equity
	 * @return
	 */
	@PostMapping(value = "/equity")
	public ReturnData add(Equity equity) {
		Equity add = equityService.add(equity);
		if (add == null) {
			logger.info("create equity fail!");
			return new ReturnData(ReturnCode.FAIL, "create equity fail!", null);
		}
		logger.info("create equity success!");
		return new ReturnData(ReturnCode.FAIL, "create equity success!", add);
	}
	
	/**
	 * update
	 * @param equity
	 * @return
	 */
	@PutMapping(value = "/equity/{id}")
	public ReturnData update(Equity equity) {
		Equity update = equityService.add(equity);
		if (update == null) {
			logger.info("update equity fail!");
			return new ReturnData(ReturnCode.FAIL, "create equity fail!", null);
		}
		logger.info("update equity success!");
		return new ReturnData(ReturnCode.FAIL, "create equity success!", update);
	}
	
	/**
	 * delete equity
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/equity/{id}")
	public ReturnData delete(@PathVariable int id) {
		equityService.delete(id);
		logger.info("delete equity success!");
		return new ReturnData(ReturnCode.SUCCESS, "delete equity success!", null);
	}
	
	/**
	 * query equity
	 * @param id
	 * @return equity or null
	 */
	@GetMapping(value = "/equity/{id}")
	public ReturnData query(@PathVariable int id) {
		Equity equity = equityService.query(id);
		if (equity == null) {
			logger.info("query equity fail!");
			return new ReturnData(ReturnCode.FAIL, "query equity fail!", null);
		}
		logger.info("query equity success!");
		return new ReturnData(ReturnCode.SUCCESS, "query equity success!", equity);
	}
}
