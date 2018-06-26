package com.es.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.es.models.Advertisement;

public interface AdvertisementRepository extends MongoRepository<Advertisement, String>{

}