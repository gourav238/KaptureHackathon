package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.PurchaseOrder;

@RestController("purchaseorder")
public class PurchaseOrderController {
    
    @RequestMapping("/add")
    public ResponseEntity< ? > addPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return null;
    }

    @RequestMapping("/update")
    public ResponseEntity< ? > updatePurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return null;
    }

    @RequestMapping("/delete")
    public ResponseEntity< ? > deletePurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return null;
    }

}
