package com.rex.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rex.pm.entities.Positions;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
public interface PositionRepository extends JpaRepository<Positions, Integer> {

}
