package com.rex.pm.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.rex.pm.entities.Price;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
public interface PriceRepository extends JpaRepository<Price, Integer> {

	@Modifying
	@Query("select p from Price p where p.date between ?1 and ?2")
	List<Price> getPriceBetween(Date start, Date end);
}
