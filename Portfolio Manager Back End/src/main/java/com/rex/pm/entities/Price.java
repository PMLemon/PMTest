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
public class Price implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	private int id;
	private double bidPrice;
	private double offerPrice;
	private Date date;
	private String type;
	private String currency;
	
	public Price() {
		super();
	}

	public Price(int id, double bidPrice, double offerPrice, Date date, String type, String currency) {
		super();
		this.id = id;
		this.bidPrice = bidPrice;
		this.offerPrice = offerPrice;
		this.date = date;
		this.type = type;
		this.currency = currency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
		Price other = (Price) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Price [id=" + id + ", bidPrice=" + bidPrice + ", offerPrice=" + offerPrice + ", date=" + date
				+ ", currency=" + currency + "]";
	}
}
