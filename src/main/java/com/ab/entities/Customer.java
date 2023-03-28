package com.ab.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int customerId;
	
	String customerName;

}
