package com.kapture.fieldservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.kapture.fieldservice.object.Config;

@Repository
public interface ConfigRepository extends MongoRepository<Config, Integer>{

	@Query("{ \"cmId\": ?0, \"configName\": ?1}")
    public Config findByCmIdAndConfigName(int cmId, String configName);

}
