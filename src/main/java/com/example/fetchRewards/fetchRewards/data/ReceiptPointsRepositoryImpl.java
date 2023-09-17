/**
 * This package contains the implementation of the data layer components
 * responsible for managing receipt data and associated points in the FetchRewards application.
 * It includes the ReceiptPointsRepositoryImpl class, which implements the IReceiptPointsRepository interface
 * to store and retrieve receipt information and points using in-memory HashMaps.
 * The repository implementation interacts with the data storage to manage receipts and associated points.
 */
package com.example.fetchRewards.fetchRewards.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.fetchRewards.fetchRewards.model.request.Receipt;

@Service
public class ReceiptPointsRepositoryImpl implements IReceiptPointsRepository{
    // In-memory storage for receipts using a HashMap
    private final Map<String, Receipt> receiptMap = new HashMap<>();

    // In-memory storage for points using a HashMap
    private final Map<String, Integer> pointsMap = new HashMap<>();

    // Method to store a receipt in the in-memory storage
    public void storeReceipt(String receiptId, Receipt receipt) {
        receiptMap.put(receiptId, receipt);
    }

    // Method to get a receipt from the in-memory storage
    public Receipt getReceipt(String receiptId) {
        return receiptMap.get(receiptId);
    }

    // Method to store points in the in-memory storage
    public void storePoints(String receiptId, int points) {
        pointsMap.put(receiptId, points);
    }

    // Method to get points from the in-memory storage
    public Integer getPoints(String receiptId) {
        return pointsMap.get(receiptId);
    }
}
