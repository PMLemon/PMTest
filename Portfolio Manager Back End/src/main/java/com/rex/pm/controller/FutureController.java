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
import com.rex.pm.entities.Future;
import com.rex.pm.service.FutureService;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FutureController {
	
	private Logger logger = LoggerFactory.getLogger(FutureController.class);

	@Autowired
	private FutureService futureService;

	/**
	 * create future
	 * @param future
	 * @return the future be created or null
	 */
	@PostMapping(value = "/future")
	public ReturnData add(Future future) {
		Future add = futureService.add(future);
		if (add == null) {
			logger.info("create future fail!");
			return new ReturnData(ReturnCode.FAIL, "create future fail!", null);
		}
		logger.info("create future success!");
		return new ReturnData(ReturnCode.SUCCESS, "create future success!", add);
	}
	
	/**
	 * update future
	 * @param future
	 * @return the future be updated or null
	 */
	@PutMapping(value = "/future/{id}")
	public ReturnData update(Future future) {
		Future update = futureService.update(future);
		if (update == null) {
			logger.info("update future fail!");
			return new ReturnData(ReturnCode.FAIL, "update future fail!", null);
		}
		logger.info("update future success!");
		return new ReturnData(ReturnCode.SUCCESS, "update future success!", update);
	}
	
	/**
	 * delete future
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/future/{id}")
	public ReturnData delete(@PathVariable int id) {
		futureService.delete(id);
		logger.info("delete future success!");
		return new ReturnData(ReturnCode.SUCCESS, "delete future success!", null);
	}
	
	/**
	 * query future
	 * @param id
	 * @return future or null
	 */
	@GetMapping(value = "/future/{id}")
	public ReturnData query(@PathVariable int id) {
		Future future = futureService.query(id);
		if (future == null) {
			logger.info("query future fail!");
			return new ReturnData(ReturnCode.FAIL, "query future fail!", null);
		}
		logger.info("query future success!");
		return new ReturnData(ReturnCode.SUCCESS, "query future success!", future);
	}
}
