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
public class Bond implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	private String issure;
	private String coupon;
	private Date maturityDate;
	
	public Bond() {
		super();
	}

	public Bond(int id, String issure, String coupon, Date maturityDate) {
		super();
		this.id = id;
		this.issure = issure;
		this.coupon = coupon;
		this.maturityDate = maturityDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIssure() {
		return issure;
	}

	public void setIssure(String issure) {
		this.issure = issure;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public Date getMaturitydate() {
		return maturityDate;
	}

	public void setMaturitydate(Date maturityDate) {
		this.maturityDate = maturityDate;
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
		Bond other = (Bond) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bond [id=" + id + ", issure=" + issure + ", coupon=" + coupon + ", maturitydate=" + maturityDate + "]";
	}
	
}
