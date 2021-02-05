package com.thoughtworks.india.model;

import com.thoughtworks.india.constants.Comodity;

public class Rate {
	
	private Comodity comodity;
	private double rate;
	
	public Rate(Comodity comodity,double rate){
		    this.comodity=comodity;
		    this.rate=rate;
	}
	public Comodity getComodity() {
		return comodity;
	}
	public void setComodity(Comodity comodity) {
		this.comodity = comodity;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Rate inputRate = (Rate)obj;
		if(this.comodity.equals(inputRate.comodity)&&
				this.rate==inputRate.rate){
			return true;
		}
		return false;
	}
	
	

}
