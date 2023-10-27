package com.kapture.fieldservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.Supplier;

@Repository
public interface SupplierRepository extends MongoRepository<Supplier, Integer>{

}
