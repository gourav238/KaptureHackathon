package com.kapture.fieldservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapture.fieldservice.object.Order;
import com.kapture.fieldservice.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    HttpServletRequest request;
    @Autowired
    OrderService orderService;

    @PostMapping("/add")
    public ResponseEntity< ? > addOrder(@RequestBody String requestPayload) {
        return orderService.add(requestPayload,request);
    }
    
    @GetMapping("/get")
    public ResponseEntity< ? > getOrder() {
        return orderService.findAll(request);
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
