package com.renz.realStateListing;
/*
 * Jayson Mallari
 */
public class realStateListing {
	
	public static void main(String[] args){
		
		Property land = new Property(100000, 2.1, "land");
		System.out.println(land.toString());
		
		Property estate = new Property(250000, 1.5, "estate", 3, 4);
		System.out.println(estate.toString());
		
		estate.setAskingPrice(230000);
		System.out.println(estate.toString());
	}

}
