package com.es.services;

import com.es.models.Admin;

public interface AdminService {

	Admin create(Admin admin);
	
	boolean update(Admin newAdmin);
	
	void delete(Admin admin);
}
