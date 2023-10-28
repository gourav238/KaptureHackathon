package com.kapture.fieldservice.object;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Config {

	@Id
	@Field
	private String Id;
	
	@Field
	@Indexed
	private int cmId;
	
	@Field
	@Indexed
	private String configName;
	
	@Field
	private String config;
	
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

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
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
