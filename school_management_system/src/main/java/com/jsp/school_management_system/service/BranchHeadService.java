package com.jsp.school_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.school_management_system.dao.BranchHeadDao;
import com.jsp.school_management_system.dto.BranchHead;
@Service
public class BranchHeadService {

	@Autowired
	BranchHeadDao branchHeadDao;
	
	public BranchHead saveBranchHead(BranchHead branchHead) {
		return branchHeadDao.saveBranchHead(branchHead);
	}
	
	public BranchHead fetchBranchHeadById(int id) {
		return branchHeadDao.fetchBranchHeadById(id);
	}
	
	public BranchHead deleteBranchHead(int id) {
		return branchHeadDao.deleteBranchHead(id);
	}
	
	public BranchHead updateBranchHead(int id, BranchHead branchHead) {
		return branchHeadDao.updateBranchHead(id, branchHead);
	}
}
