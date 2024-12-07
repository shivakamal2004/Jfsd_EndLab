package com.klu.S25HI;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("fulltime")
public class FulltimeEmployee extends Employee{
	int esal;

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "FulltimeEmployee [esal=" + esal + "]";
	}
	

}
