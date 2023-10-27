package com.kapture.fieldservice.object;

import java.util.Calendar;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.JsonNode;

@Document
public class PurchaseOrder {

	@Id
	@Field
	private String id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	private String invoiceNumber;
	
	@Field
	private List<Integer> productIdsList;
	
	@Field
	private List<Integer> orderIdsList;
	
	@Field
	private String status;
	
	@Field
	private String errorReason;
	
	@Field
	private JsonNode otherDetail;
	
	@Field
	private Calendar createdDate;
	
	@Field
	private Calendar lastUpdatedDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCmId() {
		return cmId;
	}

	public void setCmId(int cmId) {
		this.cmId = cmId;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public List<Integer> getProductIdsList() {
		return productIdsList;
	}

	public void setProductIdsList(List<Integer> productIdsList) {
		this.productIdsList = productIdsList;
	}

	public List<Integer> getOrderIdsList() {
		return orderIdsList;
	}

	public void setOrderIdsList(List<Integer> orderIdsList) {
		this.orderIdsList = orderIdsList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public JsonNode getOtherDetail() {
		return otherDetail;
	}

	public void setOtherDetail(JsonNode otherDetail) {
		this.otherDetail = otherDetail;
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
	
	
}
