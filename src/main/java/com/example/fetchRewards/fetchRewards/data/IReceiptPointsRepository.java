/**
 * This package contains the data layer components for managing receipt data and points in the FetchRewards application.
 * It includes the IReceiptPointsRepository interface, defining methods to store and retrieve receipt information and points.
 * Implementations of this interface interact with the underlying data storage to manage receipts and associated points.
 */
package com.example.fetchRewards.fetchRewards.data;

import com.example.fetchRewards.fetchRewards.model.request.Receipt;

public interface IReceiptPointsRepository {
	void storeReceipt(String receiptId, Receipt receipt);

    Receipt getReceipt(String receiptId);

    void storePoints(String receiptId, int points);

    Integer getPoints(String receiptId);
}
