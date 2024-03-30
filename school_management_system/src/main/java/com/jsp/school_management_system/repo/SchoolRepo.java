package com.jsp.school_management_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.school_management_system.dto.School;

public interface SchoolRepo extends JpaRepository<School, Integer>{

}
