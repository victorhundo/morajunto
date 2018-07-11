package com.es.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.es.models.Advertisement;

public interface AdvertisementRepository extends MongoRepository<Advertisement, String>{

    public List<Advertisement> findByUsername(String username);

}