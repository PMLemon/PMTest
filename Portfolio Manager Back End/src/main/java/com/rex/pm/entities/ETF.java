package com.rex.pm.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Entity
public class ETF implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	private int id;
	private String symbol;
	
	public ETF() {
		super();
	}

	public ETF(int id, String symbol) {
		super();
		this.id = id;
		this.symbol = symbol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ETF other = (ETF) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ETF [id=" + id + ", symbol=" + symbol + "]";
	}
}
