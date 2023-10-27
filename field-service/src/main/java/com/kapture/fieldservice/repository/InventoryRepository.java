package com.kapture.fieldservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.Inventory;

@Repository
public interface InventoryRepository extends MongoRepository<Inventory, Integer>{

}
