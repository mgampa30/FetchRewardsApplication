/**
 * This package contains the service layer components responsible for processing receipts
 * and managing points in the FetchRewards application.
 * It includes the ReceiptProcessingServiceImpl class, which implements the IReceiptProcessingService interface
 * to process receipts, calculate points, and manage associated data using a points repository.
 * The service implementation interacts with the repository and calculates points based on receipt data and rules.
 */
package com.example.fetchRewards.fetchRewards.service;

import com.example.fetchRewards.fetchRewards.data.IReceiptPointsRepository;
import com.example.fetchRewards.fetchRewards.model.request.Receipt;
import com.example.fetchRewards.fetchRewards.model.response.ResponseId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReceiptProcessingServiceImpl implements IReceiptProcessingService {

	private final IReceiptPointsRepository receiptPoints;
    private final ICalculatePointsService calculatePointsService;

    @Autowired
    public ReceiptProcessingServiceImpl(IReceiptPointsRepository receiptPoints, ICalculatePointsService calculatePointsService) {
        this.receiptPoints = receiptPoints;
        this.calculatePointsService = calculatePointsService;
    }
    @Override
    public ResponseId processReceipt(Receipt receipt) {
        String receiptId = UUID.randomUUID().toString();
        int points = calculatePointsService.calculatePoints(receipt);

        receiptPoints.storeReceipt(receiptId, receipt);
        receiptPoints.storePoints(receiptId, points);

        return new ResponseId(receiptId);
    }

    @Override
    public Integer getPoints(String receiptId) {
        return receiptPoints.getPoints(receiptId);
    }
}



