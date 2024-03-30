package com.jsp.school_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.school_management_system.dto.Address;
import com.jsp.school_management_system.dto.Branch;
import com.jsp.school_management_system.dto.BranchHead;
import com.jsp.school_management_system.dto.Teacher;
import com.jsp.school_management_system.service.BranchService;

@RestController
public class BranchController {

	@Autowired
	BranchService branchService;
	
	@PostMapping("/saveBranch")
	public Branch saveBranch(@RequestBody Branch branch) {
		return branchService.saveBranch(branch);
	}
	
	@GetMapping("/fetchBranchById")
	public Branch fetchBranchById(int id) {
		return branchService.fetchBranchById(id);
	}
	
	@DeleteMapping("/deleteBranch")
	public Branch deleteBranch(int id) {
		return  branchService.deleteBranch(id);
	}
	
	@PutMapping("/updateBranch")
	public Branch updateBranch(@RequestBody Branch branch,int id) {
		return branchService.updateBranch(branch, id);
	}
	
	@PutMapping("/existingBranchHeadToExistingBranch")
	public Branch existingBranchHeadToExistingBranch(int bHId,int bId) {
		return branchService.existingBranchHeadToExistingBranch(bHId, bId);
	}
	
	@PostMapping("/newBranchHeadToExistingBranch")
	public Branch newBranchHeadToExistingBranch(int bHId,int bId,@RequestBody BranchHead newBranchHead) {
		return branchService.newBranchHeadToExistingBranch(bHId, bId, newBranchHead);
	}
	
	@PostMapping("/existingBranchHeadToNewBranch")
	public Branch existingBranchHeadToNewBranch(int bHId,int bId,@RequestBody Branch newBranch) {
		return branchService.existingBranchHeadToNewBranch(bHId, bId, newBranch);
	}
	
	@PutMapping("/existingAddressToExistingBranch")
	public Branch existingAddressToExistingBranch(int aId,int bId) {
		return branchService.existingAddressToExistingBranch(aId, bId);
	}
	
	@PostMapping("/newAddressToExistingBranch")
	public Branch newAddressToExistingBranch(int aId,int bId,@RequestBody Address newAddress) {
		return branchService.newAddressToExistingBranch(aId, bId, newAddress);
	}
	
	@PutMapping("/existingTeachersToExistingBranch")
	public Branch existingTeachersToExistingBranch(int tId,int tId1,int tId2,int bId){
		return branchService.existingTeachersToExistingBranch(tId, tId1, tId2, bId);
	}
	
	@PostMapping("/newTeachersToExistingBranch")
	public Branch newTeachersToExistingBranch(int bId,int tId,int tId1,int tId2,@RequestBody Teacher teacher,@RequestBody Teacher teacher1,@RequestBody Teacher teacher2) {
		return branchService.newTeachersToExistingBranch(bId, tId, tId1, tId2, teacher, teacher1, teacher2);
	}
	
	@PutMapping("/existingStudentsToExistingBranch")
	public Branch existingStudentsToExistingBranch(int sId, int sId1, int sId2, int bId) {
		return branchService.existingStudentsToExistingBranch(sId, sId1, sId2, bId);
	}
}
