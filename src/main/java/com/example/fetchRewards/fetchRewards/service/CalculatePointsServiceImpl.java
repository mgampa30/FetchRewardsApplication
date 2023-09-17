/**
 * This package contains the service layer components responsible for calculating points
 * based on receipt information in the FetchRewards application.
 * It includes the CalculatePointsServiceImpl class, which implements the ICalculatePointsService interface
 * to calculate points for a given receipt using specific rules and criteria.
 * The service implementation calculates points based on various receipt attributes and conditions.
 */
package com.example.fetchRewards.fetchRewards.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fetchRewards.fetchRewards.model.request.Item;
import com.example.fetchRewards.fetchRewards.model.request.Receipt;

@Service
public class CalculatePointsServiceImpl implements ICalculatePointsService {

    @Override
    public int calculatePoints(Receipt receipt) {
        int points = 0;

        // One point for every alphanumeric character in the retailer name
        points += receipt.getRetailer().chars().filter(Character::isLetterOrDigit).count();

        // 50 points if the total is a round dollar amount with no cents
        if (receipt.getTotal() == Math.floor(receipt.getTotal()))
            points += 50;

        // 25 points if the total is a multiple of 0.25
        if (receipt.getTotal() % 0.25 == 0)
            points += 25;

        // 5 points for every two items on the receipt
        List<Item> items = receipt.getItems();
        points += (items.size() / 2) * 5;

        // Multiply price based on item description length
        points += items.stream()
                .filter(item -> item.getShortDescription().trim().length() % 3 == 0)
                .mapToInt(item -> (int) Math.ceil(item.getPrice() * 0.2))
                .sum();

        // 6 points if the day in the purchase date is odd
        int day = Integer.parseInt(receipt.getPurchaseDate().split("-")[2]);
        if (day % 2 != 0)
            points += 6;

        // 10 points if the time of purchase is after 2:00pm and before 4:00pm
        int hour = Integer.parseInt(receipt.getPurchaseTime().split(":")[0]);
        if (hour >= 14 && hour < 16)
            points += 10;

        return points;
    }
}