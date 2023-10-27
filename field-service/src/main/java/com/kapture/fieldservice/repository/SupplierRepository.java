package com.kapture.fieldservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.Supplier;

@Repository
public interface SupplierRepository extends MongoRepository<Supplier, String>{

	@Query("{ \"cmId\": ?0, \"isEnable\": true}")
	public List<Supplier> getByCmId(int cmId);
	
	@Query("{ \"_id\": ?0 }")
	public Supplier getById(String id);
}
