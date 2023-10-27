package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Supplier;

@RestController
@RequestMapping("supplier")
public class SupplierController {

    @PostMapping("/add")
    public ResponseEntity< ? > addSupplier(@RequestBody Supplier supplier) {
        return null;
    }

    @PostMapping("/update")
    public ResponseEntity< ? > updateSupplier(@RequestBody Supplier supplier) {
        return null;
    }

    @PostMapping("/delete")
    public ResponseEntity< ? > deleteSupplier(@RequestBody Supplier supplier) {
        return null;
    }
}

