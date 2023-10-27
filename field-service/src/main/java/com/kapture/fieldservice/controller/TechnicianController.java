package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kapture.fieldservice.object.Technician;

public class TechnicianController {

    @RequestMapping("/add")
    public ResponseEntity< ? > addTechnician(@RequestBody Technician technician) {
        return null;
    }

    @RequestMapping("/update")
    public ResponseEntity< ? > updateTechnician(@RequestBody Technician technician) {
        return null;
    }

    @RequestMapping("/delete")
    public ResponseEntity< ? > deleteTechnician(@RequestBody Technician technician) {
        return null;
    }
}
