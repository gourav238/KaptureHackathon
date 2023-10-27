package com.kapture.fieldservice.object;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.databind.JsonNode;

import lombok.Data;

@Data
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

}
