package com.jsp.school_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.school_management_system.dao.SchoolDao;
import com.jsp.school_management_system.dto.School;

@Service
public class SchoolService {

	@Autowired
	SchoolDao schoolDao;
	
	public School saveSchool(School school) {
		return schoolDao.saveSchool(school);
	}
	
	public School fetchSchoolById(int id) {
		return schoolDao.fetchSchoolById(id);
	}
	
	public School deleteSchool(int id) {
		return schoolDao.deleteSchool(id);
	}
	
	public School updateSchool(int id,School school) {
		return schoolDao.updateSchool(id, school);
	}
	
	public School existingBranchesToExistingSchool(int sId,int bId,int bId1) {
		return schoolDao.existingBranchesToExistingSchool(sId, bId, bId1);
	}
}
