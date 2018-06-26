package com.es.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.models.Advertisement;
import com.es.repository.AdvertisementRepository;

@Service
public class AdvertisementServiceImpl implements AdvertisementService{

	@Autowired
	private AdvertisementRepository AdvertisementRepository;
	
	
	
	public AdvertisementServiceImpl(AdvertisementRepository advertisementRepository) {
		advertisementRepository = this.advertisementRepository;
	}
	
	
	
	@Override
	public Advertisement create(Advertisement advertisement) {
		return  advertisementRepository.save(advertisement);
	}

	@Override
	public List<Advertisement> findAll() {
		return advertisementRepository.findAll();
	}

	@Override
	public Advertisement getById(String id) {
		return advertisementRepository.findById(id);
	}

	@Override
	public boolean update(Advertisement newAdvertisement) {
		if (advertisementRepository.existsById(newAdvertisement.getId())) {
            advertisementRepository.save(newAdvertisement);
            return true;
		}
		return false;
	}

	@Override
	public void delete(Advertisement advertisement) {
		advertisementRepository.delete(advertisement);
		
	}
}
