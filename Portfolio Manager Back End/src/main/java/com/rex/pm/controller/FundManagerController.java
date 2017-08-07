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
import com.rex.pm.entities.FundManager;
import com.rex.pm.service.FundManagerService;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FundManagerController {
	
	private Logger logger = LoggerFactory.getLogger(FundManagerController.class);

	@Autowired
	private FundManagerService fundManagerService;

	/**
	 * create fundManager
	 * @param fundManager
	 * @return the fundManager be created or null
	 */
	@PostMapping(value = "/fundManager")
	public ReturnData add(FundManager fundManager) {
		FundManager add = fundManagerService.add(fundManager);
		if (add == null) {
			logger.info("create fundManager fail!");
			return new ReturnData(ReturnCode.FAIL, "create fundManager fail!", null);
		}
		logger.info("create fundManager success!");
		return new ReturnData(ReturnCode.SUCCESS, "create fundManager success!", add);
	}
	
	/**
	 * update fundManager
	 * @param fundManager
	 * @return the fundManager be updated or null
	 */
	@PutMapping(value = "/fundManager/{id}")
	public ReturnData update(FundManager fundManager) {
		FundManager update = fundManagerService.update(fundManager);
		if (update == null) {
			logger.info("update fundManager fail!");
			return new ReturnData(ReturnCode.FAIL, "update fundManager fail!", null);
		}
		logger.info("update fundManager success!");
		return new ReturnData(ReturnCode.SUCCESS, "update fundManager success!", update);
	}
	
	/**
	 * delete fundManager
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/fundManager/{id}")
	public ReturnData delete(@PathVariable int id) {
		fundManagerService.delete(id);
		logger.info("delete fundManager success!");
		return new ReturnData(ReturnCode.SUCCESS, "delete fundManager success!", null);
	}
	
	/**
	 * query fundManager
	 * @param id
	 * @return fundManager or null
	 */
	@GetMapping(value = "/fundManager/{id}")
	public ReturnData query(@PathVariable int id) {
		FundManager fundManager = fundManagerService.query(id);
		if (fundManager == null) {
			logger.info("query fundManager fail!");
			return new ReturnData(ReturnCode.FAIL, "query fundManager fail!", null);
		}
		logger.info("query fundManager success!");
		return new ReturnData(ReturnCode.SUCCESS, "query fundManager success!", fundManager);
	}
}
