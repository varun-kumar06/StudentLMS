package com.sample.MarksheetService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sample.MarksheetEntity;
import com.sample.MarksheetDao.MarksheetDao;

@Service
public class MarksheetService {
	
	@Autowired
	MarksheetDao md;
	
	
	public String postAllMark(List<MarksheetEntity> ms) {
		
		for(MarksheetEntity x:ms) {
			x.setSem1Total(x.getSem1Theory()+x.getSem1Practicals());
			x.setSem2Total(x.getSem2Theory()+x.getSem2Practicals());
		}
	 
		
		return md.postAllMark(ms);
		
	}
	
	public List<MarksheetEntity> getAllMark(){
		return md.getAllMark();
	}

}
