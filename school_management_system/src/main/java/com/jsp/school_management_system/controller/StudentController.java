package com.jsp.school_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.school_management_system.dto.Student;
import com.jsp.school_management_system.service.StudentService;
@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	@GetMapping("/fetchStudentById")
	public Student fetchStudentById(int id) {
		return studentService.fetchStudentById(id);
	}
	@DeleteMapping("/deleteStudent")
	public Student deleteStudent(int id) {
		return studentService.deleteStudent(id);
	}
	@PutMapping("/updateStudent")
	public Student updateStudent(int id,@RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
}
