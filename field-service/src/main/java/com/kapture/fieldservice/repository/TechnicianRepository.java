package com.kapture.fieldservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.Technician;

@Repository
public interface TechnicianRepository extends MongoRepository<Technician, String>{

}
