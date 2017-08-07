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
public class Security implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	private int id;
	private String issn;
	private Price price;
	
	public Security() {
		super();
	}

	public Security(int id, String issn, Price price) {
		super();
		this.id = id;
		this.issn = issn;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
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
		Security other = (Security) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Security [id=" + id + ", issn=" + issn + ", price=" + price + "]";
	}
}
