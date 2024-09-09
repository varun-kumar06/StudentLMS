package com.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sample.StudentResultService.StudentResultService;

@RestController
@RequestMapping(value="/result")
public class StudentResultController {
	
	@Autowired
	StudentResultService srs;
	
	@Autowired
	RestTemplate rt;
	
	@PostMapping(value="/postAll")
	public String setall(@RequestBody List<ResultEntity> a) {

		String url1 = "http://localhost:8081/MarkSheet/getAllMark";
		String url2 = "http://localhost:8082/Student/getAll";
		
		ResponseEntity<List<StudentMarkSheet1>> re1= rt.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<StudentMarkSheet1>>() {
		});
		
		List<StudentMarkSheet1> pp1 = re1.getBody();
		
//		ResponseEntity<List<StudentDetails1>> re2= rt.exchange(url2, HttpMethod.GET, null, new ParameterizedTypeReference<List<StudentDetails1>>() {
//		});
//		
//		List<StudentDetails1> pp2 = re2.getBody();
		
		for(int i=0; i<a.size(); i++) {
			
			if(a.get(i).getRollnumber()==(pp1.get(i).getRollNumber())) {
				
				a.get(i).setRollnumber(pp1.get(i).getRollNumber()); 
				a.get(i).setTotalmarks(pp1.get(i).getSem1Total()+ pp1.get(i).getSem2Total());
				
				a.get(i).setPercentage(((pp1.get(i).getSem1Total()+pp1.get(i).getSem2Total())*100)/200);
								
			}		
		}
		return srs.setall(a); 

		                                 
	}

}
