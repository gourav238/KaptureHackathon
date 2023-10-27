package com.kapture.fieldservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

	@Query("{ 'cmId': ?0}")
	public List<Product> getByCmId(int cmId);
}
