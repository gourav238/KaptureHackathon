package com.kapture.fieldservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping("/get")
    public ResponseEntity< ? > getSupplierListById(@RequestBody Supplier supplier) {
        return supplierService.getSupplierList();
    }

    @PostMapping("/disable")
    public ResponseEntity< ? > deleteSupplier(@RequestParam("supplierId") String supplierId) {
        return null;
    }
}

