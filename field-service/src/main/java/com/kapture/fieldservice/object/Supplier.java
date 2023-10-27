package com.kapture.fieldservice.object;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.JsonNode;

@Document
public class Supplier {

	@Id
	@Field
	private int id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	private String name;
	
	@Field
	private JsonNode address;
	
	@Field
	private JsonNode otherDetail;
	
	@Field
	private Calendar createdDate;
	
	@Field
	@Indexed
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JsonNode getAddress() {
		return address;
	}

	public void setAddress(JsonNode address) {
		this.address = address;
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
