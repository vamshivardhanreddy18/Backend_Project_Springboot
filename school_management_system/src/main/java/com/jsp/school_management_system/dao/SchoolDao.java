package com.jsp.school_management_system.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.school_management_system.dto.Branch;
import com.jsp.school_management_system.dto.School;
import com.jsp.school_management_system.repo.SchoolRepo;

@Repository
public class SchoolDao {

	@Autowired
	SchoolRepo schoolRepo;
	
	@Autowired
	BranchDao branchDao;

	public School saveSchool(School school) {
		return schoolRepo.save(school);
	}

	public School fetchSchoolById(int id) {
		return schoolRepo.findById(id).get();
	}
	
	public School deleteSchool(int id) {
		School school=fetchSchoolById(id);
		schoolRepo.delete(school);
		return school;
	}
	
	public School updateSchool(int id, School school) {
		school.setSchoolId(id);
		saveSchool(school);
		return school;
	}
	
	public School existingBranchesToExistingSchool(int sId,int bId,int bId1) {
		School school=fetchSchoolById(sId);
		
		Branch branch=branchDao.fetchBranchById(bId);
		Branch branch1=branchDao.fetchBranchById(bId1);
		
		List<Branch> list=new ArrayList<Branch>();
		list.add(branch);
		list.add(branch1);
		
		school.setBranch(list);
		return saveSchool(school);
	}
}
