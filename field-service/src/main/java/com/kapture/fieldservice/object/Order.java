package com.kapture.fieldservice.object;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.JsonNode;

@Document(collection = "order")
public class Order {

	@Id
	@Field
	private int id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	private JsonNode orderItems;
	
	@Field
	@Indexed
	private int customerId;
	
	@Field
	private JsonNode address;
	
	@Field
	@Indexed
	private Calendar createdDate;
	
	@Field
	@Indexed
	private Calendar lastUpdatedDate;
	
	@Field
	private boolean isProcessed;
	
	@Field
	private String errorReason;
	
	@Field
	@Indexed
	private String orderStatus;
	
	@Field
	private JsonNode orderDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCmId() {
		return cmId;
	}

	public void setCmId(int cmId) {
		this.cmId = cmId;
	}

	public JsonNode getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(JsonNode orderItems) {
		this.orderItems = orderItems;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public JsonNode getAddress() {
		return address;
	}

	public void setAddress(JsonNode address) {
		this.address = address;
	}

	public Calendar getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

	public Calendar getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Calendar lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public boolean isProcessed() {
		return isProcessed;
	}

	public void setProcessed(boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

	public String getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public JsonNode getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(JsonNode orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	
}
