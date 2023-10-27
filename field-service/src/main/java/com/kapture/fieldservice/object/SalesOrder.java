package com.kapture.fieldservice.object;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Calendar;

@Document
public class SalesOrder {
    @Id
    @Field
    int id;
    @Field
    int cmId;
    @Field
    int technicianId;
    @Field
    Calendar lastModificationDate;
    @Field
    int orderId;
    @Field
    JsonNode otherDetails;
    @Field
    int productId;
    @Field
    String orderType;
    @Field
    String status;
    @Field
    int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCmId() {
        return cmId;
    }

    public void setCmId(int cmId) {
        this.cmId = cmId;
    }

    public int getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(int technicianId) {
        this.technicianId = technicianId;
    }

    public Calendar getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Calendar lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public JsonNode getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(JsonNode otherDetails) {
        this.otherDetails = otherDetails;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
