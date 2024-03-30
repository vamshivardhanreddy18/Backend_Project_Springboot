package com.jsp.school_management_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.school_management_system.dto.BranchHead;
import com.jsp.school_management_system.repo.BranchHeadRepo;

@Repository
public class BranchHeadDao {

	@Autowired
	BranchHeadRepo branchHeadRepo;

	public BranchHead saveBranchHead(BranchHead branchHead) {
		return branchHeadRepo.save(branchHead);
	}

	public BranchHead fetchBranchHeadById(int id) {
		return branchHeadRepo.findById(id).get();
	}
	
	public BranchHead deleteBranchHead(int id) {
		BranchHead branchHead=fetchBranchHeadById(id);
		branchHeadRepo.delete(branchHead);
		return branchHead;
	}
	
	public BranchHead updateBranchHead(int id,BranchHead branchHead) {
		branchHead.setBranchHeadId(id);
		return saveBranchHead(branchHead);
	}
}
