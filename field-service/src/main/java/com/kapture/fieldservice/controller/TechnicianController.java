package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Technician;

@RestController
@RequestMapping("technician")
public class TechnicianController {

    @PostMapping("/add")
    public ResponseEntity< ? > addTechnician(@RequestBody Technician technician) {
        return null;
    }

    @PostMapping("/update")
    public ResponseEntity< ? > updateTechnician(@RequestBody Technician technician) {
        return null;
    }

    @PostMapping("/delete")
    public ResponseEntity< ? > deleteTechnician(@RequestBody Technician technician) {
        return null;
    }
}
