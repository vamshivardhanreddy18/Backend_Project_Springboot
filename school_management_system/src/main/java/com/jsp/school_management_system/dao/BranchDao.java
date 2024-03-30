package com.jsp.school_management_system.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.school_management_system.dto.Address;
import com.jsp.school_management_system.dto.Branch;
import com.jsp.school_management_system.dto.BranchHead;
import com.jsp.school_management_system.dto.Student;
import com.jsp.school_management_system.dto.Teacher;
import com.jsp.school_management_system.repo.BranchRepo;

@Repository
public class BranchDao {

	@Autowired
	BranchRepo branchRepo;

	@Autowired
	BranchHeadDao branchHeadDao;

	@Autowired
	AddressDao addressDao;

	@Autowired
	TeacherDao teacherDao;
	
	@Autowired
	StudentDao studentDao;

	public Branch saveBranch(Branch branch) {
		return branchRepo.save(branch);
	}

	public Branch fetchBranchById(int id) {
		return branchRepo.findById(id).get();
	}

	public Branch deleBranch(int id) {
		Branch branch = fetchBranchById(id);
		branchRepo.deleteById(id);
		return branch;
	}

	public Branch updateBranch(int id, Branch branch) {
		branch.setBranchId(id);
		return saveBranch(branch);
	}

	// BranchHeadtoBranch
	public Branch existingBranchHeadToExistingBranch(int bHId, int bId) {
		Branch branch = fetchBranchById(bId);
		BranchHead branchHead = branchHeadDao.fetchBranchHeadById(bHId);

		branch.setBranchHead(branchHead);
		return saveBranch(branch);
	}

	// BranchHeadtoBranch
	public Branch newBranchHeadToExistingBranch(int bHId, int bId, BranchHead newBranchHead) {
		branchHeadDao.saveBranchHead(newBranchHead);
		Branch branch = fetchBranchById(bId);
		BranchHead head = branchHeadDao.fetchBranchHeadById(bHId);

		branch.setBranchHead(head);
		return saveBranch(branch);
	}

	// BranchHeadtoBranch
	public Branch existingBranchHeadToNewBranch(int bHId, int bId, Branch newBranch) {
		saveBranch(newBranch);
		Branch branch = fetchBranchById(bId);
		BranchHead branchHead = branchHeadDao.fetchBranchHeadById(bHId);

		branch.setBranchHead(branchHead);
		return saveBranch(branch);
	}

	// AddresstOBranch
	public Branch existingAddressToExistingBranch(int aId, int bId) {
		Branch branch = fetchBranchById(bId);
		Address address = addressDao.fetchAddressById(aId);

		branch.setAddress(address);
		return saveBranch(branch);
	}

	// AddresstoBranch
	public Branch newAddressToExistingBranch(int aId, int bId, Address newAddress) {
		addressDao.saveAddress(newAddress);
		Branch branch = fetchBranchById(bId);
		Address address = addressDao.fetchAddressById(aId);

		branch.setAddress(address);
		return saveBranch(branch);
	}

	public Branch existingTeachersToExistingBranch(int tId, int tId1, int tId2, int bId) {

		Branch branch = fetchBranchById(bId);

		Teacher teacher = teacherDao.fetchTeacherById(tId);
		Teacher teacher1 = teacherDao.fetchTeacherById(tId1);
		Teacher teacher2 = teacherDao.fetchTeacherById(tId2);

		List<Teacher> list = new ArrayList<Teacher>();
		list.add(teacher);
		list.add(teacher1);
		list.add(teacher2);

		branch.setTeacher(list);
		return saveBranch(branch);
	}

	public Branch newTeachersToExistingBranch(int bId, int tId, int tId1, int tId2, Teacher teacher, Teacher teacher1,
			Teacher teacher2) {
		teacherDao.saveTeacher(teacher);
		teacherDao.saveTeacher(teacher1);
		teacherDao.saveTeacher(teacher2);

		Branch branch=existingTeachersToExistingBranch(tId, tId1, tId2, bId);
		return saveBranch(branch);

	}
	
	public Branch existingStudentsToExistingBranch(int sId, int sId1, int sId2, int bId) {
		
		Branch branch = fetchBranchById(bId);

		Student student= studentDao.fetchStudentById(sId);
		Student student1 = studentDao.fetchStudentById(sId1);
		Student student2 = studentDao.fetchStudentById(sId2);

		List<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);

		branch.setStudent(list);
		return saveBranch(branch);
	}
	

}
