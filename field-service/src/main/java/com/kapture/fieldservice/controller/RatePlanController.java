package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.RatePlan;

@RestController("rateplan")
public class RatePlanController {

    @RequestMapping("/add")
    public ResponseEntity< ? > addRatePlan(@RequestBody RatePlan ratePlan) {
        return null;
    }

    @RequestMapping("/update")
    public ResponseEntity< ? > updateRatePlan(@RequestBody RatePlan ratePlan) {
        return null;
    }

    @RequestMapping("/delete")
    public ResponseEntity< ? > deleteRatePlan(@RequestBody RatePlan ratePlan) {
        return null;
    }
}
