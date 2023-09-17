/**
 * This package contains classes representing request models for the application.
 * It includes classes like Item, which represent individual items in a receipt.
 */
package com.example.fetchRewards.fetchRewards.model.request;


public class Item {

    private String shortDescription;
    private double price;
    public String getShortDescription() {
		return shortDescription;
	}
	public double getPrice() {
		return price;
	}
	
}	
 