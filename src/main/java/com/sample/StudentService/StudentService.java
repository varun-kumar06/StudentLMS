package com.sample.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sample.StudentEntity;
import com.sample.Exception.AgeNotEligible;
import com.sample.StudentDao.StudentDao;


@Service
public class StudentService {

	@Autowired
	StudentDao sd;
	
	public String postAllStudent(List<StudentEntity> e) throws Exception {
		
		
//		ArrayList<StudentEntity> a= new ArrayList<>();
//		
//		for (int i = 0; i < e.size(); i++) {
//	        if (e.get(i).getAge() > 18) {
//	            a.add(e.get(i));
//	        }
//	    }
		
		List<StudentEntity> a = e.stream().filter(x->x.getAge() > 18).collect(Collectors.toList());
		
		if (a.isEmpty()) {
	        return sd.postAllStudent(e);
	    }
		else {
	     throw new AgeNotEligible("Age not valid"); 
		}
	}
	
	public List<StudentEntity> getAll(){
		return sd.getAll();
	}
}
