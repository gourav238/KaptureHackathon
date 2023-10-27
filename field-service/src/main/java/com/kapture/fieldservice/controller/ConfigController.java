package com.kapture.fieldservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Config;
import com.kapture.fieldservice.service.ConfigService;

@RestController
@RequestMapping("config")
public class ConfigController {
	
	@Autowired
	private ConfigService configService;
	
	@Autowired
	HttpServletRequest request;
    
    @PostMapping("/add")
    public ResponseEntity<?> addConfig(@RequestBody Config config){
        return configService.saveConfig(config, request);
    }
    
    @GetMapping("/get")
    public ResponseEntity<?> getConfig(@RequestParam("id") int id){
        return configService.getById(id, request);
    }
    
    @PostMapping("/delete")
    public ResponseEntity<?> deleteConfig(@RequestBody Config config){
        return null;
    }

}
