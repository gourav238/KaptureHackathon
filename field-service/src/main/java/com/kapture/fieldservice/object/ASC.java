package com.kapture.fieldservice.object;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

public class ASC {

	@Id
	@Field
	private String Id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	private String address;
	
	@Field
	private String name;
	
	@Field
	@Indexed
	private int externalId;
	
	@Field
	private String orderDetail;
	
	@Field
	private long createdDate;
	
	@Field
	private long lastUpdatedDate;

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public int getCmId() {
		return cmId;
	}

	public void setCmId(int cmId) {
		this.cmId = cmId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
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

	public String getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
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
	
	

}
