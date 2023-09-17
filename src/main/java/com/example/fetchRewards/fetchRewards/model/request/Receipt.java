/**
 * This package contains classes representing request models for the application.
 * It includes classes like Receipt, which represent a receipt for processing.
 */
package com.example.fetchRewards.fetchRewards.model.request;

import java.util.List;
public class Receipt {
    private String retailer;

    private String purchaseDate;
    private String purchaseTime;
    private List<Item> items;
    private double total;

    public String getRetailer() {
		return retailer;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public String getPurchaseTime() {
		return purchaseTime;
	}
	public List<Item> getItems() {
		return items;
	}
	public double getTotal() {
		return total;
	}

   
}
