package com.es.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.es.models.Admin;

public interface AdminRepository extends MongoRepository<Admin,String> {

}
