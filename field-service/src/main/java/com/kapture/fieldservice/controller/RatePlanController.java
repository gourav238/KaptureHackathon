package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.RatePlan;

@RestController
@RequestMapping("rateplan")
public class RatePlanController {

    @PostMapping("/add")
    public ResponseEntity< ? > addRatePlan(@RequestBody RatePlan ratePlan) {
        return null;
    }

    @PostMapping("/update")
    public ResponseEntity< ? > updateRatePlan(@RequestBody RatePlan ratePlan) {
        return null;
    }

    @PostMapping("/delete")
    public ResponseEntity< ? > deleteRatePlan(@RequestBody RatePlan ratePlan) {
        return null;
    }
}
