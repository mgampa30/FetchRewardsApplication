/**
 * This package contains the service layer components responsible for calculating points
 * based on receipt information in the FetchRewards application.
 * It includes the ICalculatePointsService interface, defining the contract for calculating points
 * for a given receipt using specific rules and criteria.
 * Implementations of this interface define the logic to calculate points based on various receipt attributes and conditions.
 */
package com.example.fetchRewards.fetchRewards.service;

import com.example.fetchRewards.fetchRewards.model.request.Receipt;

public interface ICalculatePointsService {
	int calculatePoints(Receipt receipt);
}
