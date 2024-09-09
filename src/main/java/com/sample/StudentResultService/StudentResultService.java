package com.sample.StudentResultService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.ResultEntity;
import com.sample.StudentResultDao.StudentResultDao;

@Service
public class StudentResultService {

	@Autowired
	StudentResultDao srd;
	
	public String setall(List<ResultEntity> re) {
		
		return srd.setall(re);
	}
	
}
