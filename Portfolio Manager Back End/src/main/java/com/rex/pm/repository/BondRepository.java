package com.rex.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rex.pm.entities.Bond;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
public interface BondRepository extends JpaRepository<Bond, Integer> {

}
