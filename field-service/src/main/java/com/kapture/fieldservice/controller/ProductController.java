package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Product;

@RestController("product")
public class ProductController {

    @RequestMapping("/add")
    public ResponseEntity< ? > addProduct(@RequestBody Product product) {
        return null;
    }

    @RequestMapping("/update")
    public ResponseEntity< ? > updateProduct(@RequestBody Product product) {
        return null;
    }

    @RequestMapping("/delete")
    public ResponseEntity< ? > deleteProduct(@RequestBody Product product) {
        return null;
    }
}
