package com.kapture.fieldservice.object;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.JsonNode;

public class Technician {

	@Id
	@Field
	private int id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	private JsonNode address;
	
	@Field
	private String name;
	
	@Field
	@Indexed
	private int externalId;
	
	@Field
	private JsonNode orderDetail;
	
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

	public JsonNode getAddress() {
		return address;
	}

	public void setAddress(JsonNode address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExternalId() {
		return externalId;
	}

	public void setExternalId(int externalId) {
		this.externalId = externalId;
	}

	public JsonNode getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(JsonNode orderDetail) {
		this.orderDetail = orderDetail;
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
