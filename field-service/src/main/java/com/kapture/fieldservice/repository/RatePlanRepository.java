package com.kapture.fieldservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.RatePlan;

@Repository
public interface RatePlanRepository extends MongoRepository<RatePlan, Integer>{

}
