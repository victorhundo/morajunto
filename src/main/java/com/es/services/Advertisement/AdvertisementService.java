package com.es.services.Advertisement;

import java.util.List;
import java.util.Optional;

import com.es.models.Advertisement;


public interface AdvertisementService {
	
	Advertisement create(Advertisement advertisement);

	List<Advertisement> findAll();

	List<Advertisement> getByUsername(String username);

	Optional<Advertisement> getById(String id);

	boolean update(Advertisement newAdvertisement);

    void delete(Advertisement advertisement);
}
