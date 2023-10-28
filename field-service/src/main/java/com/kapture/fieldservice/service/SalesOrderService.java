package com.kapture.fieldservice.service;

import com.kapture.fieldservice.object.*;
import com.kapture.fieldservice.repository.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class SalesOrderService {

    private static final Logger log = LoggerFactory.getLogger(SalesOrderService.class);
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    PurchaseOrderRepository purchaseOrderRepository;
    @Autowired
    TechnicianRepository technicianRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    SalesOrderRepository salesOrderRepository;

    public JSONObject addSalesOrder(String requestBody) {
        JSONObject responseJson = JSONObject.fromObject("{\"status\":\"failure\",\"response\":{},\"reason\":\"\"}");
        try {
            JSONObject requestJSON = JSONObject.fromObject(requestBody);
            if (requestJSON == null || requestJSON.isNullObject()) {
                return responseJson;
            }
            Order order = orderRepository.findById(requestJSON.optString("orderId")).get();
            Product product = productRepository.findById(requestJSON.optString("productId")).get();
            Technician technician = technicianRepository.findById(requestJSON.optString("technicianId")).get();
            JSONArray productArray = requestJSON.optJSONArray("productJson");
            if (order == null || product == null || technician == null || productArray == null || productArray.isEmpty()) {
                return responseJson;
            }
            SalesOrder salesOrder = new SalesOrder();
            salesOrder.setCmId(order.getCmId());
            salesOrder.setStatus("CREATED");
            salesOrder.setOrderId(order.getId());
            salesOrder.setProductId(product.getId());
            salesOrder.setTechnicianId(technician.getId());
            salesOrder.setProductDetails(productArray.toString());
            salesOrder = salesOrderRepository.save(salesOrder);
            Calendar currCal = Calendar.getInstance();
            List<PurchaseOrder> purchaseOrders = new ArrayList<>();
            if (productArray != null && !productArray.isEmpty()) {
                for (int idx = 0; idx < productArray.size(); idx++) {
                    JSONObject productJson = productArray.optJSONObject(idx);
                    if (productJson != null && !productJson.isNullObject()) {
                        PurchaseOrder purchaseOrder = new PurchaseOrder();
                        purchaseOrder.setCmId(order.getCmId());
                        purchaseOrder.setOrderId(order.getId());
                        purchaseOrder.setCreatedDate(currCal.getTimeInMillis());
                        purchaseOrder.setProductId(productJson.optString("productId"));
                        purchaseOrder.setQuantity(productJson.optInt("quantity"));
                        purchaseOrder.setSalesOrderId(salesOrder.getId());
                        purchaseOrder.setStatus("REQUESTED_TO_ASC");
                        purchaseOrders.add(purchaseOrder);
                    }
                }
            }
            purchaseOrders = purchaseOrderRepository.saveAll(purchaseOrders);
        } catch (Exception e) {
            log.error("Error in addSalesOrder()", e);
        }
        return responseJson;
    }
}
