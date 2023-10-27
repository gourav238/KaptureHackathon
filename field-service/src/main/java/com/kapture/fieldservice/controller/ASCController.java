package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.ASC;

@RestController("asc")
public class ASCController {

    @RequestMapping("/add")
    public ResponseEntity<?> addASC(@RequestBody ASC asc){
        return null;
    }
    
    @RequestMapping("/update")
    public ResponseEntity<?> updateASC(@RequestBody ASC asc){
        return null;
    }
    
    @RequestMapping("/delete")
    public ResponseEntity<?> deleteASC(@RequestBody ASC asc){
        return null;
    }
}
