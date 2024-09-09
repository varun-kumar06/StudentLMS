package com.sample.StudentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.StudentEntity;
import com.sample.StudentRepository.StudentRepository;

@Repository
public class StudentDao {
	
	@Autowired
	StudentRepository sr;
	
	public String postAllStudent(List<StudentEntity> e) {
		 sr.saveAll(e);
		 return "Posted";
		 
	}
	
	public List<StudentEntity>getAll(){
		return sr.findAll();
	}

}
