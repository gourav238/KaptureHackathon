package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.PurchaseOrder;

@RestController
@RequestMapping("purchaseorder")
public class PurchaseOrderController {
    
    @PostMapping("/add")
    public ResponseEntity< ? > addPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return null;
    }

    @PostMapping("/update")
    public ResponseEntity< ? > updatePurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return null;
    }

    @PostMapping("/delete")
    public ResponseEntity< ? > deletePurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return null;
    }

}
