package com.jsp.school_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.school_management_system.dao.StudentDao;
import com.jsp.school_management_system.dto.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public Student saveStudent(Student student) {
		return studentDao.savePerson(student);
	}
	
	public Student fetchStudentById(int id) {
		return studentDao.fetchStudentById(id);
	}
	
	public Student deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}
	
	public Student updateStudent(int id,Student student) {
		return studentDao.updateStudent(id, student);
	}
}
