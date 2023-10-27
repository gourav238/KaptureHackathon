package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.ProductCategory;

@RestController
@RequestMapping("productcategory")
public class ProductCategoryController {
    
    @PostMapping("/add")
    public ResponseEntity< ? > addProductCategory(@RequestBody ProductCategory productCategory) {
        return null;
    }

    @PostMapping("/update")
    public ResponseEntity< ? > updateProductCategory(@RequestBody ProductCategory productCategory) {
        return null;
    }

    @PostMapping("/delete")
    public ResponseEntity< ? > deleteProductCategory(@RequestBody ProductCategory productCategory) {
        return null;
    }

}
