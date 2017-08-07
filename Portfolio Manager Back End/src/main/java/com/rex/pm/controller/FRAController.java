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
import com.rex.pm.entities.FRA;
import com.rex.pm.service.FRAService;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FRAController {
	
	private Logger logger = LoggerFactory.getLogger(FRAController.class);

	@Autowired
	private FRAService fraService;

	/**
	 * create fra
	 * @param fra
	 * @return the fra be created or null
	 */
	@PostMapping(value = "/fra")
	public ReturnData add(FRA fra) {
		FRA add = fraService.add(fra);
		if (add == null) {
			logger.info("create fra fail!");
			return new ReturnData(ReturnCode.FAIL, "create fra fail!", null);
		}
		logger.info("create fra success!");
		return new ReturnData(ReturnCode.SUCCESS, "create fra success!", add);
	}
	
	/**
	 * update fra
	 * @param fra
	 * @return the fra be updated or null
	 */
	@PutMapping(value = "/fra/{id}")
	public ReturnData update(FRA fra) {
		FRA update = fraService.update(fra);
		if (update == null) {
			logger.info("update fra fail!");
			return new ReturnData(ReturnCode.FAIL, "update fra fail!", null);
		}
		logger.info("update fra success!");
		return new ReturnData(ReturnCode.SUCCESS, "update fra success!", update);
	}
	
	/**
	 * delete fra
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/fra/{id}")
	public ReturnData delete(@PathVariable int id) {
		fraService.delete(id);
		logger.info("delete fra success!");
		return new ReturnData(ReturnCode.SUCCESS, "delete fra success!", null);
	}
	
	/**
	 * query fra
	 * @param id
	 * @return fra or null
	 */
	@GetMapping(value = "/fra/{id}")
	public ReturnData query(@PathVariable int id) {
		FRA fra = fraService.query(id);
		if (fra == null) {
			logger.info("query fra fail!");
			return new ReturnData(ReturnCode.FAIL, "query fra fail!", null);
		}
		logger.info("query fra success!");
		return new ReturnData(ReturnCode.SUCCESS, "query fra success!", fra);
	}
}
