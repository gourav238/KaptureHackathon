package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Config;

@RestController("config")
public class ConfigController {
    
    @RequestMapping("/add")
    public ResponseEntity<?> addConfig(@RequestBody Config config){
        return null;
    }
    
    @RequestMapping("/update")
    public ResponseEntity<?> updateConfig(@RequestBody Config config){
        return null;
    }
    
    @RequestMapping("/delete")
    public ResponseEntity<?> deleteConfig(@RequestBody Config config){
        return null;
    }

}
