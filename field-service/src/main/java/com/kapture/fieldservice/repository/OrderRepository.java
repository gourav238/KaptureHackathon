package com.kapture.fieldservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.Order;
import com.kapture.fieldservice.object.Supplier;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>{

    @Query("{ \"cmId\": ?0}")
    public List<Order> getByCmId(int cmId);

}
