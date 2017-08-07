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
import com.rex.pm.entities.Bond;
import com.rex.pm.service.BondService;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BondController {
	
	private Logger logger = LoggerFactory.getLogger(BondController.class);

	@Autowired
	private BondService bondService;

	/**
	 * create bond
	 * @param bond
	 * @return the bond be created or null
	 */
	@PostMapping(value = "/bond")
	public ReturnData add(Bond bond) {
		Bond add = bondService.add(bond);
		if (add == null) {
			logger.info("create bond fail!");
			return new ReturnData(ReturnCode.FAIL, "create bond fail!", null);
		}
		logger.info("create bond success!");
		return new ReturnData(ReturnCode.SUCCESS, "create bond success!", add);
	}
	
	/**
	 * update bond
	 * @param bond
	 * @return the bond be updated or null
	 */
	@PutMapping(value = "/bond/{id}")
	public ReturnData update(Bond bond) {
		Bond update = bondService.update(bond);
		if (update == null) {
			logger.info("update bond fail!");
			return new ReturnData(ReturnCode.FAIL, "update bond fail!", null);
		}
		logger.info("update bond success!");
		return new ReturnData(ReturnCode.SUCCESS, "update bond success!", update);
	}
	
	/**
	 * delete bond
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/bond/{id}")
	public ReturnData delete(@PathVariable int id) {
		bondService.delete(id);
		logger.info("delete bond success!");
		return new ReturnData(ReturnCode.SUCCESS, "delete bond success!", null);
	}
	
	/**
	 * query bond
	 * @param id
	 * @return bond or null
	 */
	@GetMapping(value = "/bond/{id}")
	public ReturnData query(@PathVariable int id) {
		Bond bond = bondService.query(id);
		if (bond == null) {
			logger.info("query bond fail!");
			return new ReturnData(ReturnCode.FAIL, "query bond fail!", null);
		}
		logger.info("query bond success!");
		return new ReturnData(ReturnCode.SUCCESS, "query bond success!", bond);
	}
}
