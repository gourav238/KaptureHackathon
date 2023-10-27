package com.kapture.fieldservice.object;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document
public class Partner {

	@Id
	@Field
	private int id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	@Indexed
	private String domain;
	
	@Field
	private String name;
	
}
