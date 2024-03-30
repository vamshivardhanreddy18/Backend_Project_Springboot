package com.jsp.school_management_system.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.school_management_system.dto.Admin;
import com.jsp.school_management_system.dto.School;
import com.jsp.school_management_system.repo.AdminRepo;

@Repository
public class AdminDao {

	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	SchoolDao schoolDao;

	public Admin saveAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	public Admin fetchAdminById(int id) {
//		return	adminRepo.findById(id).get();
		
		Optional<Admin> admin=adminRepo.findById(id);
		if (admin.isPresent()) {
			return admin.get();
		}
		else {
			return null;
		}
	}

	public Admin deleteAdmin(int id) {
		Admin admin = fetchAdminById(id);
		 adminRepo.delete(admin);
		return admin;
	}

	public Admin updateAdmin(int id, Admin newAdmin) {
		newAdmin.setAdminId(id);
		return saveAdmin(newAdmin);
	}
	
	public Admin existingSchoolToExistingAdmin(int aId,int sId) {
		Admin admin=fetchAdminById(aId);
		School school=schoolDao.fetchSchoolById(sId);
		
		admin.setSchool(school);
		return saveAdmin(admin);
	}
	
	public Admin existingSchoolNewAdmin(int aId,int sId,Admin newAdmin) {
		saveAdmin(newAdmin);
		Admin admin=fetchAdminById(aId);
		School school=schoolDao.fetchSchoolById(sId);
		admin.setSchool(school);
		return saveAdmin(admin);
	}
}
