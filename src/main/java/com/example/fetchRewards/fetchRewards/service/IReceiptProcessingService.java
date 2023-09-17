/**
 * This package contains the service layer components responsible for processing receipts
 * and managing points in the FetchRewards application.
 * It includes the IReceiptProcessingService interface, defining the contract for processing receipts
 * and retrieving points associated with receipts.
 * Implementations of this interface handle receipt processing and points retrieval based on the provided receipt data.
 */
package com.example.fetchRewards.fetchRewards.service;

import com.example.fetchRewards.fetchRewards.model.request.Receipt;
import com.example.fetchRewards.fetchRewards.model.response.ResponseId;

public interface IReceiptProcessingService {

    ResponseId processReceipt(Receipt receipt);

    Integer getPoints(String receiptId);
}