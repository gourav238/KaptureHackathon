package com.kapture.fieldservice.object;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.JsonNode;

@Document
public class RatePlan {

	@Id
	@Field
	private int id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	@Indexed
	private int productId;
	
	@Field
	private JsonNode otherDetail;
	
	@Field
	private Calendar createdDate;
	
	@Field
	private Calendar lastUpdatedDate;

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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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
