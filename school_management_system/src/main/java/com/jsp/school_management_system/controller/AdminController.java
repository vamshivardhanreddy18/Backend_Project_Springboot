package com.jsp.school_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.school_management_system.dto.Admin;
import com.jsp.school_management_system.service.AdminService;
import com.jsp.school_management_system.util.ResponseStructure;

@RestController
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/saveAdmin")
	public ResponseEntity<ResponseStructure<Admin>> saveAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);
	}
	
	@GetMapping("/fetchAdminById")
	public ResponseEntity<ResponseStructure<Admin>> fetchAdminById(int i) {
		return adminService.fetchAdminById(i);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<Admin>> deleteAdmin(int id) {
		return adminService.deleteAdmin(id);
	}
	
	@PutMapping("/updateAdmin")
	public ResponseEntity<ResponseStructure<Admin>> updateAdmin(int id,@RequestBody Admin admin) {
		return adminService.updateAdmin(id, admin);
	}
	
	@PutMapping("/existingSchoolToExistingAdmin")
	public Admin existingSchoolToExistingAdmin(int aId,int sId) {
		return adminService.existingSchoolToExistingAdmin(aId, sId);
	}
	
	@PostMapping("existingSchoolNewAdmin")
	public Admin existingSchoolNewAdmin(int aId,int sId,@RequestBody Admin newAdmin) {
		return adminService.existingSchoolNewAdmin(aId, sId, newAdmin);
	}
	
}
