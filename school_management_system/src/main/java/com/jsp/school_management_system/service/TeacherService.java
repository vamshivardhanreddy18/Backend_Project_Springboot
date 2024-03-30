package com.jsp.school_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.school_management_system.dao.TeacherDao;
import com.jsp.school_management_system.dto.Teacher;

@Service
public class TeacherService {

	@Autowired
	TeacherDao teacherDao;
	
	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
	}
	
	public Teacher fetchTeacherById(int id) {
		return teacherDao.fetchTeacherById(id);
	}
	
	public Teacher deleteTeacher(int id) {
		return teacherDao.deleteTeacher(id);
	}
	
	public Teacher updateTeacher(int id,Teacher teacher) {
		return teacherDao.updateTeacher(id, teacher);
	}
}
