package com.jsp.school_management_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.school_management_system.dto.Teacher;
import com.jsp.school_management_system.repo.TeacherRepo;

@Repository
public class TeacherDao {

	@Autowired
	TeacherRepo teacherRepo;

	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	public Teacher fetchTeacherById(int id) {
		return teacherRepo.findById(id).get();
	}
	
	public Teacher deleteTeacher(int id) {
		Teacher teacher=fetchTeacherById(id);
		teacherRepo.delete(teacher);
		return teacher;
	}
	
	public Teacher updateTeacher(int id,Teacher teacher) {
		teacher.setTeacherId(id);
		return saveTeacher(teacher);
	}
}
