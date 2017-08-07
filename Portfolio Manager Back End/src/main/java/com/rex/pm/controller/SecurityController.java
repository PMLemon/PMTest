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
import com.rex.pm.entities.Security;
import com.rex.pm.service.SecurityService;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SecurityController {
	
	private Logger logger = LoggerFactory.getLogger(SecurityController.class);

	@Autowired
	private SecurityService SecurityService;

	/**
	 * create security
	 * @param security
	 * @return the security be created or null
	 */
	@PostMapping(value = "/security")
	public ReturnData add(Security security) {
		Security add = SecurityService.add(security);
		if (add == null) {
			logger.info("create security fail!");
			return new ReturnData(ReturnCode.FAIL, "create security fail!", null);
		}
		logger.info("create security success!");
		return new ReturnData(ReturnCode.SUCCESS, "create security success!", add);
	}
	
	/**
	 * update security
	 * @param security
	 * @return the security be updated or null
	 */
	@PutMapping(value = "/security/{id}")
	public ReturnData update(Security security) {
		Security update = SecurityService.update(security);
		if (update == null) {
			logger.info("update security fail!");
			return new ReturnData(ReturnCode.FAIL, "update security fail!", null);
		}
		logger.info("update security success!");
		return new ReturnData(ReturnCode.SUCCESS, "update security success!", update);
	}
	
	/**
	 * delete security
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/security/{id}")
	public ReturnData delete(@PathVariable int id) {
		SecurityService.delete(id);
		logger.info("delete security success!");
		return new ReturnData(ReturnCode.SUCCESS, "delete security success!", null);
	}
	
	/**
	 * query security
	 * @param id
	 * @return security or null
	 */
	@GetMapping(value = "/security/{id}")
	public ReturnData query(@PathVariable int id) {
		Security security = SecurityService.query(id);
		if (security == null) {
			logger.info("query security fail!");
			return new ReturnData(ReturnCode.FAIL, "query security fail!", null);
		}
		logger.info("query security success!");
		return new ReturnData(ReturnCode.SUCCESS, "query security success!", security);
	}
}
