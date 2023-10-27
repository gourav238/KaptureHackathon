package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Inventory;

@RestController
@RequestMapping("inventory")
public class InventoryController {
    
    @PostMapping("/add")
    public ResponseEntity<?> addInventory(@RequestBody Inventory inventory){
        return null;
    }
    
    @PostMapping("/update")
    public ResponseEntity<?> updateInventory(@RequestBody Inventory inventory){
        return null;
    }
    
    @PostMapping("/delete")
    public ResponseEntity<?> deleteInventory(@RequestBody Inventory inventory){
        return null;
    }

}
