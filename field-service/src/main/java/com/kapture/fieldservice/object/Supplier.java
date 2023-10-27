package com.kapture.fieldservice.object;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.JsonNode;

import lombok.Data;

@Data
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
}
