package com.kapture.fieldservice.object;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class Supplier {

	@MongoId(FieldType.OBJECT_ID)
	private String id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	private String name;
	
	@Field
	private String address;
	
	@Field
	private String otherDetail;
	
	@Field
	private boolean isEnable;
	
	@Field
	private long createdDate;
	
	@Field
	@Indexed
	private long lastUpdatedDate;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOtherDetail() {
		return otherDetail;
	}

	public void setOtherDetail(String otherDetail) {
		this.otherDetail = otherDetail;
	}

	public long getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(long createdDate) {
		this.createdDate = createdDate;
	}

	public long getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(long lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}
	
}
