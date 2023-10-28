package com.kapture.fieldservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Product;
import com.kapture.fieldservice.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private HttpServletRequest request;

    @PostMapping("/add")
    public ResponseEntity< ? > addProduct(@RequestBody String requestBody) {
        return productService.saveProduct(requestBody, request);
    }

    @GetMapping("/get")
    public ResponseEntity< ? > getProductListByCmId() {
        return productService.getProductList();
    }

    @PostMapping("/delete")
    public ResponseEntity< ? > deleteProduct(@RequestBody Product product) {
        return null;
    }
}
