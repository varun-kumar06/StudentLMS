package com.sample.MarksheetDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.MarksheetEntity;
import com.sample.MarksheetRepository.MarksheetRepository;

@Repository
public class MarksheetDao {
	
	@Autowired
	MarksheetRepository mr;
	
	public String postAllMark(List<MarksheetEntity> ms) {
		mr.saveAll(ms);
		return "MarkPosted Successfully";
	}
	
	public List<MarksheetEntity> getAllMark(){
		return mr.findAll();
	}

}
