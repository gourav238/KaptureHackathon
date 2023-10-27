package com.kapture.fieldservice.service;

import javax.servlet.http.HttpServletRequest;

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

	public ResponseEntity<?> saveConfig(Config config, HttpServletRequest request) {
		String message = "";
		boolean status = false;
		HttpStatus httpStatus = HttpStatus.OK;
		JSONObject jsonObject = new JSONObject();
		try {
			System.out.println(request.getContentType());
			if (config == null) {
				jsonObject.put("status", status);
				jsonObject.put("message", "request body is mandatory");
				return new ResponseEntity<JSONObject>(jsonObject, HttpStatus.BAD_REQUEST);
			}
			
			configRepository.save(config);
			
			status = true;
			message = "data added successfully";
			
		} catch (Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			message = "some error occurred";
			e.printStackTrace();
		}
		jsonObject.put("status", status);
		jsonObject.put("message", message);
		return new ResponseEntity<JSONObject>(jsonObject, httpStatus);
	}
}
