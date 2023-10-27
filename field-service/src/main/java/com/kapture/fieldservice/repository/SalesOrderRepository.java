package com.kapture.fieldservice.repository;

import com.kapture.fieldservice.object.SalesOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesOrderRepository extends MongoRepository<SalesOrder, Integer> {
}
