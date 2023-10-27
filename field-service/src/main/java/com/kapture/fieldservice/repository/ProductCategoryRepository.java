package com.kapture.fieldservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.ProductCategory;

@Repository
public interface ProductCategoryRepository extends MongoRepository<ProductCategory, String>{

}
