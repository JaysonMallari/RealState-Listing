package com.renz.realStateListing;
/*
 * Jayson Mallari
 */

public class Property {
	private double askingPrice, lotSize;
	private String propertyType;
	private int numBath, numBed;

	public Property(double askingPrice, double lotSize, String propertyType){
		this.askingPrice = askingPrice;
		this.lotSize = lotSize;
		this.propertyType = propertyType;
		this.numBath = 0;
		this.numBed = 0;
	}
	
	public Property(double askingPrice, double lotSize, String propertyType,
			int numBath, int numBed){
			
			this.askingPrice = askingPrice;
			this.lotSize = lotSize;
			this.propertyType = propertyType;
			this.numBath = numBath;
			this.numBed = numBed;
	}
	
	public String toString(){
		return  "Asking price : $ " + askingPrice +
				"\nLot Size : " + lotSize + 
				"\nProperty Type : " + propertyType +
				"\nNumber of Bath : " + numBath +
				"\nNumber of Bed : " +  numBed ;
	}
	
	public void setAskingPrice(double newValue){
		askingPrice = newValue;
	}
}
