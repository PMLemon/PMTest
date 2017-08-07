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
import com.rex.pm.entities.Positions;
import com.rex.pm.service.PositionService;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PositionController {
	
	private Logger logger = LoggerFactory.getLogger(PositionController.class);

	@Autowired
	private PositionService positionService;

	/**
	 * create position
	 * @param position
	 * @return the position be created or null
	 */
	@PostMapping(value = "/position")
	public ReturnData add(Positions position) {
		Positions add = positionService.add(position);
		if (add == null) {
			logger.info("create position fail!");
			return new ReturnData(ReturnCode.FAIL, "create position fail!", null);
		}
		logger.info("create position success!");
		return new ReturnData(ReturnCode.SUCCESS, "create position success!", add);
	}
	
	/**
	 * update position
	 * @param position
	 * @return the position be updated or null
	 */
	@PutMapping(value = "/position/{id}")
	public ReturnData update(Positions position) {
		Positions update = positionService.update(position);
		if (update == null) {
			logger.info("update position fail!");
			return new ReturnData(ReturnCode.FAIL, "update position fail!", null);
		}
		logger.info("update position success!");
		return new ReturnData(ReturnCode.SUCCESS, "update position success!", update);
	}
	
	/**
	 * delete position
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/position/{id}")
	public ReturnData delete(@PathVariable int id) {
		positionService.delete(id);
		logger.info("delete position success!");
		return new ReturnData(ReturnCode.SUCCESS, "delete position success!", null);
	}
	
	/**
	 * query position
	 * @param id
	 * @return position or null
	 */
	@GetMapping(value = "/position/{id}")
	public ReturnData query(@PathVariable int id) {
		Positions position = positionService.query(id);
		if (position == null) {
			logger.info("query position fail!");
			return new ReturnData(ReturnCode.FAIL, "query position fail!", null);
		}
		logger.info("query position success!");
		return new ReturnData(ReturnCode.SUCCESS, "query position success!", position);
	}
}
