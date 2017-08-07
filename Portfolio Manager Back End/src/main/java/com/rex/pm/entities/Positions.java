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
public class Positions implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id
	private int id;
	private Security security;
	private int quantity;
	
	public Positions() {
		super();
	}

	public Positions(int id, Security security, int quantity) {
		super();
		this.id = id;
		this.security = security;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
		Positions other = (Positions) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Postion [id=" + id + ", quantity=" + quantity + "]";
	}
}
