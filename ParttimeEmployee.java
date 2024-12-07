package com.klu.S25HI;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("parttime")
public class ParttimeEmployee extends Employee{
	int payment;

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "ParttimeEmployee [payment=" + payment + "]";
	}
	
	

}
