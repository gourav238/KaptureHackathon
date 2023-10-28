package com.kapture.fieldservice.object;



import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "product")
public class Product {

	@MongoId(FieldType.OBJECT_ID)
	private String id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	@Indexed
	private String parentCategory;
	
	@Field
	private String name;
	
	@Field
	@Indexed
	private String skuCode;
	
	@Field
	@Indexed
	private String description;
	
	@Field
	private String config;		//jsonobject other details
	
	@Field
	@Indexed
	private int supplierId;
	
	@Field
	private double price;
	
	@Field
	private String tax;			//jsonobject based on country
	
	@Field
	private int warranty;		//number of days
	
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

	public String getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(String parentCategory) {
		this.parentCategory = parentCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
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
