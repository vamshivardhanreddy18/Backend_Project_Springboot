package com.jsp.school_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.school_management_system.dao.BranchDao;
import com.jsp.school_management_system.dto.Address;
import com.jsp.school_management_system.dto.Branch;
import com.jsp.school_management_system.dto.BranchHead;
import com.jsp.school_management_system.dto.Teacher;

@Service
public class BranchService {

	@Autowired
	BranchDao branchDao;
	
	public Branch saveBranch(Branch branch) {
		return branchDao.saveBranch(branch);
	}
	
	public Branch fetchBranchById(int id) {
		return branchDao.fetchBranchById(id);
	}
	
	public Branch deleteBranch(int id) {
		return  branchDao.deleBranch(id);
	}
	
	public Branch updateBranch(Branch branch,int id) {
		return branchDao.updateBranch(id, branch);
	}
	
	public Branch existingBranchHeadToExistingBranch(int bHId,int bId) {
		return branchDao.existingBranchHeadToExistingBranch(bHId, bId);
	}
	
	public Branch newBranchHeadToExistingBranch(int bHId,int bId, BranchHead newBranchHead) {
		return branchDao.newBranchHeadToExistingBranch(bHId, bId, newBranchHead);
	}
	
	public Branch existingBranchHeadToNewBranch(int bHId,int bId, Branch newBranch) {
		return branchDao.existingBranchHeadToNewBranch(bHId, bId, newBranch);
	}
	
	public Branch existingAddressToExistingBranch(int aId,int bId) {
		return branchDao.existingAddressToExistingBranch(aId, bId);
	}
	
	public Branch newAddressToExistingBranch(int aId,int bId,Address newAddress) {
		return branchDao.newAddressToExistingBranch(aId, bId, newAddress);
	}
	
	public Branch existingTeachersToExistingBranch(int tId,int tId1,int tId2,int bId){
		return branchDao.existingTeachersToExistingBranch(tId, tId1, tId2, bId);
	}
	
	public Branch newTeachersToExistingBranch(int bId,int tId,int tId1,int tId2,Teacher teacher,Teacher teacher1,Teacher teacher2) {
		return branchDao.newTeachersToExistingBranch(bId, tId, tId1, tId2, teacher, teacher1, teacher2);
	}
	
	public Branch existingStudentsToExistingBranch(int sId, int sId1, int sId2, int bId) {
		return branchDao.existingStudentsToExistingBranch(sId, sId1, sId2, bId);
	}
	
}
