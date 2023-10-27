package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Order;

@RestController
@RequestMapping("order")
public class OrderController {

    @PostMapping("/add")
    public ResponseEntity< ? > addOrder(@RequestBody Order order) {
        return null;
    }

    @PostMapping("/update")
    public ResponseEntity< ? > updateOrder(@RequestBody Order order) {
        return null;
    }

    @RequestMapping("/delete")
    public ResponseEntity< ? > deleteOrder(@RequestBody Order order) {
        return null;
    }
}
