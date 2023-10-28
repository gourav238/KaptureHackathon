package com.kapture.fieldservice.controller;

import com.kapture.fieldservice.service.SalesOrderService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("salesOrder")
public class SalesOrderController {
    @Autowired
    SalesOrderService salesOrderService;

    @PostMapping("/add")
    public ResponseEntity<?> addSalesOrder(@RequestBody String requestBody) {
        JSONObject responseJson = salesOrderService.addSalesOrder(requestBody);
        return new ResponseEntity<JSONObject>(responseJson, responseJson.get("status").equals("failure") ? HttpStatus.BAD_REQUEST : HttpStatus.ACCEPTED);
    }

}
