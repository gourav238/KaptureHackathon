package com.kapture.fieldservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Order;

@RestController("order")
public class OrderController {

    @RequestMapping("/add")
    public ResponseEntity< ? > addOrder(@RequestBody Order order) {
        return null;
    }

    @RequestMapping("/update")
    public ResponseEntity< ? > updateOrder(@RequestBody Order order) {
        return null;
    }

    @RequestMapping("/delete")
    public ResponseEntity< ? > deleteOrder(@RequestBody Order order) {
        return null;
    }
}
