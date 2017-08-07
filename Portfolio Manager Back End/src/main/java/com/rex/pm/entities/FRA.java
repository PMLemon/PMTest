package com.rex.pm.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
* @author Curry
* @date Aug 5, 2017
* @version 0.1
*/
@Entity
public class FRA implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	private int id;
	private Date start;
	private Date end;
	private double rate;
	
	public FRA() {
		super();
	}

	public FRA(int id, Date start, Date end, double rate) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
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
		FRA other = (FRA) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FRA [id=" + id + ", start=" + start + ", end=" + end + ", rate=" + rate + "]";
	}
}
