package com.jsp.school_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.school_management_system.dao.AdminDao;
import com.jsp.school_management_system.dto.Admin;
import com.jsp.school_management_system.exception.AdminIdNotFund;
import com.jsp.school_management_system.util.ResponseStructure;

@Service
public class AdminService {

	@Autowired
	AdminDao adminDao;

	public ResponseEntity<ResponseStructure<Admin>> saveAdmin(Admin admin) {
		ResponseStructure<Admin> responseStructure = new ResponseStructure<Admin>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("successfully Admin inserted");
		responseStructure.setData(adminDao.saveAdmin(admin));

		return new ResponseEntity<ResponseStructure<Admin>>(responseStructure, HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Admin>> fetchAdminById(int id) {
//		return adminDao.fetchAdminById(id);

		Admin admin = adminDao.fetchAdminById(id);
		if (admin != null) {
			ResponseStructure<Admin> responseStructure = new ResponseStructure<Admin>();
			responseStructure.setStatus(HttpStatus.FOUND.value());
			responseStructure.setMessage("Successfully admin fetched");
			responseStructure.setData(adminDao.fetchAdminById(id));
			return new ResponseEntity<ResponseStructure<Admin>>(responseStructure, HttpStatus.FOUND);
		} else {
			throw new AdminIdNotFund();
		}
	}

	public ResponseEntity<ResponseStructure<Admin>> deleteAdmin(int id) {
//		return adminDao.deleteAdmin(id);

		Admin admin = adminDao.fetchAdminById(id);
		if (admin != null) {
			ResponseStructure<Admin> responseStructure = new ResponseStructure<Admin>();
			responseStructure.setStatus(HttpStatus.FOUND.value());
			responseStructure.setMessage("Successfully admin deleted");
			responseStructure.setData(adminDao.fetchAdminById(id));
			return new ResponseEntity<ResponseStructure<Admin>>(responseStructure, HttpStatus.FOUND);
		} else {
			throw new AdminIdNotFund();
		}

	}

	public ResponseEntity<ResponseStructure<Admin>> updateAdmin(int id, Admin newAdmin) {
//		return adminDao.updateAdmin(id, newAdmin);
		Admin admin = adminDao.fetchAdminById(id);
		if (admin != null) {
			ResponseStructure<Admin> responseStructure = new ResponseStructure<Admin>();
			responseStructure.setStatus(HttpStatus.FOUND.value());
			responseStructure.setMessage("Successfully admin updated");
			responseStructure.setData(adminDao.fetchAdminById(id));
			return new ResponseEntity<ResponseStructure<Admin>>(responseStructure, HttpStatus.FOUND);
		} else {
			throw new AdminIdNotFund();
		}
		
	}

	public Admin existingSchoolToExistingAdmin(int aId, int sId) {
		return adminDao.existingSchoolToExistingAdmin(aId, sId);
	}

	public Admin existingSchoolNewAdmin(int aId, int sId, Admin newAdmin) {
		return adminDao.existingSchoolNewAdmin(aId, sId, newAdmin);
	}
}
