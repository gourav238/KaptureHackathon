package com.kapture.fieldservice.object;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.JsonNode;

import lombok.Data;

@Data
@Document(collection = "product")
public class Product {

	@Id
	@Field
	private int id;
	
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
	private JsonNode config;		//jsonobject other details
	
	@Field
	@Indexed
	private int supplierId;
	
	@Field
	private double price;
	
	@Field
	private JsonNode tax;			//jsonobject based on country
	
	@Field
	private int warranty;		//number of days
	
	@Field
	private Calendar createdDate;
	
	@Field
	@Indexed
	private Calendar lastUpdatedDate;
}
