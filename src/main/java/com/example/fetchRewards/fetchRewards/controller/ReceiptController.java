/**
 * This package contains the controllers for processing and managing receipts in the FetchRewards application.
 */
package com.example.fetchRewards.fetchRewards.controller;

import com.example.fetchRewards.fetchRewards.model.request.Receipt;
import com.example.fetchRewards.fetchRewards.model.response.ResponseId;
import com.example.fetchRewards.fetchRewards.service.IReceiptProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.UUID;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {

    @Autowired
    private IReceiptProcessingService receiptProcessingService;

    @PostMapping("/process")
    public ResponseEntity<?> processReceipt(@RequestBody Receipt receipt) {
        try {
            ResponseId responseId = receiptProcessingService.processReceipt(receipt);
            return ResponseEntity.ok(responseId);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the receipt: " + e.getMessage());
        }
    }

    @GetMapping("/{id}/points")
    public ResponseEntity<?> getPoints(@PathVariable("id") String id) {
        Integer points = receiptProcessingService.getPoints(id);

        return (points != null)
                ? ResponseEntity.ok(Collections.singletonMap("points", points))
                : ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No receipt found for the provided ID.");
    }
}









