package com.jsp.school_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.school_management_system.dto.School;
import com.jsp.school_management_system.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	SchoolService schoolService;
	
	@PostMapping("/saveSchool")
	public School saveSchool(@RequestBody School school) {
		return schoolService.saveSchool(school);
	}
	
	@GetMapping("/fetchSchoolById")
	public School fetchSchoolById(int id) {
		return schoolService.fetchSchoolById(id);
	}
	
	@DeleteMapping("/deleteSchool")
	public School deleteSchool(int id) {
		return schoolService.deleteSchool(id);
	}
	
	@PutMapping("/updateSchool")
	public School updateSchool(int id,@RequestBody School school) {
		return schoolService.updateSchool(id, school);
	}
	
	@PutMapping("/existingBranchesToExistingSchool")
	public School existingBranchesToExistingSchool(int sId,int bId,int bId1) {
		return schoolService.existingBranchesToExistingSchool(sId, bId, bId1);
	}
	
}
