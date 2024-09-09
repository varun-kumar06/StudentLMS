package com.sample.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	

}
