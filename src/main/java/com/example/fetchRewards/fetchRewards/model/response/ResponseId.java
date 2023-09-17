/**
 * This package contains response-related classes used in the application.
 * It includes classes like ResponseId, which represent responses from the application.
 */
package com.example.fetchRewards.fetchRewards.model.response;


public class ResponseId {
    private String id;
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ResponseId(String id) {
        this.id = id;
    }
}
