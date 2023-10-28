package com.kapture.fieldservice.object;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class ProductCategory {

	@Id
	@Field
	private String Id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	private String name;
	
	@Field
	@Indexed
	private String parentProductCategory;
	
	@Field
	private String discription;
	
	@Field
	private String otherDetail;
	
	@Field
	private long createdDate;
	
	@Field
	@Indexed
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentProductCategory() {
		return parentProductCategory;
	}

	public void setParentProductCategory(String parentProductCategory) {
		this.parentProductCategory = parentProductCategory;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
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
	
	

}
