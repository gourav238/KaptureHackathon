package com.kapture.fieldservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.Partner;

@Repository
public interface PartnerRepository extends MongoRepository<Partner, String>{

}
