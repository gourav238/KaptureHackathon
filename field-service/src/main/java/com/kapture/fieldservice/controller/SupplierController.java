package com.kapture.fieldservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Supplier;
import com.kapture.fieldservice.service.SupplierService;

@RestController
@RequestMapping("supplier")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;

    @PostMapping("/add")
    public ResponseEntity< ? > addSupplier(@RequestBody Supplier supplier) {
        return supplierService.saveSupplier(supplier);
    }

    @GetMapping("/get")
    public ResponseEntity< ? > getSupplierListById() {
        return supplierService.getSupplierList();
    }

    @PostMapping("/disable")
    public ResponseEntity< ? > deleteSupplier(@RequestBody Supplier supplier) {
        return supplierService.disableSupplierById(supplier);
    }
}

