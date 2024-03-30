package com.jsp.school_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.school_management_system.dto.BranchHead;
import com.jsp.school_management_system.service.BranchHeadService;

@RestController
public class BranchHeadController {

	@Autowired
	BranchHeadService branchHeadService;
	@PostMapping("/saveBranchHead")
	public BranchHead saveBranchHead(@RequestBody BranchHead branchHead) {
		return branchHeadService.saveBranchHead(branchHead);
	}
	@GetMapping("/fetchBranchHeadById")
	public BranchHead fetchBranchHeadById(int id) {
		return branchHeadService.fetchBranchHeadById(id);
	}
	@DeleteMapping("/deleteBranchHead")
	public BranchHead deleteBranchHead(int id) {
		return branchHeadService.deleteBranchHead(id);
	}
	@PutMapping("/updateBranchHead")
	public BranchHead updateBranchHead(int id,@RequestBody BranchHead branchHead) {
		return branchHeadService.updateBranchHead(id, branchHead);
	}
}
