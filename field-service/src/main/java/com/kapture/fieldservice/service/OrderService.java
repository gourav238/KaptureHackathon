package com.kapture.fieldservice.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.kapture.fieldservice.object.Config;
import com.kapture.fieldservice.repository.ConfigRepository;

@Service
public class OrderService {
    private static final String CONFIG_TYPE = "ORDER_CONFIG";
    private static final int CMID = 69;
    @Autowired
    ConfigRepository configRepository;

    public ResponseEntity< ? > add(String requestPayload, HttpServletRequest request) {
        Config config = configRepository.findByCmIdAndConfigName(CMID,CONFIG_TYPE);
        JsonNode jConfig = config.getConfig();
        JsonNode path = jConfig.get("path");
        
        return null;
    }

}
