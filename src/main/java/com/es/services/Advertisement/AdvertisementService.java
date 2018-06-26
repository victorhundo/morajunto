package com.es.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.es.models.Advertisement;


public interface AdvertisementService {
	
	Advertisement create(Advertisement advertisement);

	List<Advertisement> findAll();

	Advertisement getById(String id);

	boolean update(Advertisement newAdvertisement);

    void delete(Advertisement advertisement);
}
