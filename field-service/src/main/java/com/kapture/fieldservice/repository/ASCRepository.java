package com.kapture.fieldservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.ASC;

@Repository
public interface ASCRepository extends MongoRepository<ASC, Integer> {

}
