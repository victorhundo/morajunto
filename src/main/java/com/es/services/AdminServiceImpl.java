package com.es.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.models.Admin;
import com.es.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	public AdminServiceImpl(AdminRepository adminRepository) {
		adminRepository = this.adminRepository;
	}

	@Override
	public Admin create(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public boolean update(Admin newAdmin) {
		if (adminRepository.existsById(newAdmin.getId())) {
			adminRepository.save(newAdmin);
		}
		return false;
	}

	@Override
	public void delete(Admin admin) {
		adminRepository.delete(admin);
		
	}
	
	

}
