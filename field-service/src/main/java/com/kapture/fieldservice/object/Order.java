package com.kapture.fieldservice.object;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.JsonNode;

import lombok.Data;

@Data
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
}
