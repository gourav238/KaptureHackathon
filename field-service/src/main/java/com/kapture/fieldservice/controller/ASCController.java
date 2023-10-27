package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.ASC;

@RestController
@RequestMapping("asc")
public class ASCController {

    @PostMapping("/add")
    public ResponseEntity< ? > addASC(@RequestBody ASC asc) {
        return null;
    }

    @PostMapping("/update")
    public ResponseEntity< ? > updateASC(@RequestBody ASC asc) {
        return null;
    }

    @PostMapping("/delete")
    public ResponseEntity< ? > deleteASC(@RequestBody ASC asc) {
        return null;
    }
}
