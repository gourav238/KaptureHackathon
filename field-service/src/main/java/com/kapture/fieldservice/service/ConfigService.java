package com.kapture.fieldservice.service;



import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kapture.fieldservice.object.Config;
import com.kapture.fieldservice.repository.ConfigRepository;

import net.sf.json.JSONObject;

@Service
public class ConfigService {
	
	@Autowired
	private ConfigRepository configRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(ConfigService.class);
	
	private static final int CM_ID = 69;

	public ResponseEntity<?> saveConfig(Config config, HttpServletRequest request) {
		String message = "";
		boolean status = false;
		HttpStatus httpStatus = HttpStatus.OK;
		JSONObject jsonObject = new JSONObject();
		try {
			if (config == null) {
				jsonObject.put("status", status);
				jsonObject.put("message", "request body is mandatory");
				return new ResponseEntity<JSONObject>(jsonObject, HttpStatus.BAD_REQUEST);
			}
			config.setCmId(CM_ID);
			config.setCreatedDate(Calendar.getInstance().getTimeInMillis());
			config.setLastUpdatedDate(Calendar.getInstance().getTimeInMillis());
			configRepository.save(config);
			status = true;
			message = "data added successfully";
		} catch (Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			message = "some error occurred";
			logger.error("error in saveConfig() ", e);
		}
		jsonObject.put("status", status);
		jsonObject.put("message", message);
		return new ResponseEntity<JSONObject>(jsonObject, httpStatus);
	}
	
	public ResponseEntity<?> getByConfigName(String configName, HttpServletRequest request) {
		String message = "";
		boolean status = false;
		HttpStatus httpStatus = HttpStatus.OK;
		JSONObject jsonObject = new JSONObject();
		try {
			logger.error("getContentType ", request.getContentType());
			if (StringUtils.isEmpty(configName)) {
				jsonObject.put("status", status);
				jsonObject.put("message", "id is mandatory");
				return new ResponseEntity<JSONObject>(jsonObject, HttpStatus.BAD_REQUEST);
			}
			Config c = configRepository.findByCmIdAndConfigName(CM_ID, configName);
			status = true;
			message = "data added successfully";
			jsonObject.put("detail", c);
		} catch (Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			message = "some error occurred";
			logger.error("error in getById() ", e);
		}
		jsonObject.put("status", status);
		jsonObject.put("message", message);
		return new ResponseEntity<JSONObject>(jsonObject, httpStatus);
	}
}
