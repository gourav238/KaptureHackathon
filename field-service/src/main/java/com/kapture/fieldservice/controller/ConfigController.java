package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Config;

@RestController
@RequestMapping("config")
public class ConfigController {
    
    @PostMapping("/add")
    public ResponseEntity<?> addConfig(@RequestBody Config config){
        return null;
    }
    
    @PostMapping("/update")
    public ResponseEntity<?> updateConfig(@RequestBody Config config){
        return null;
    }
    
    @PostMapping("/delete")
    public ResponseEntity<?> deleteConfig(@RequestBody Config config){
        return null;
    }

}
