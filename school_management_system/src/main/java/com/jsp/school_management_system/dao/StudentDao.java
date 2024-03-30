package com.jsp.school_management_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.school_management_system.dto.Student;
import com.jsp.school_management_system.repo.StudentRepo;

@Repository
public class StudentDao {

	@Autowired
	StudentRepo studentRepo;
	
	public Student savePerson(Student student) {
		return studentRepo.save(student);
	}
	
	public Student fetchStudentById(int id) {
		return studentRepo.findById(id).get();
	}
	
	public Student deleteStudent(int id) {
		Student student=fetchStudentById(id);
		studentRepo.delete(student);
		return student;
	}
	
	public Student updateStudent(int id,Student student) {
		student.setStudentId(id);
		savePerson(student);
		return student;
	}
}
