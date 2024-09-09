package com.sample.StudentResultDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.ResultEntity;
import com.sample.StudentResultRepository.StudentResultRepository;

@Repository
public class StudentResultDao {
	
	@Autowired
	StudentResultRepository srr;
	
	public String setall(List<ResultEntity> re) {
		srr.saveAll(re);
		
		return "ResultPosted";
	}

}
