package com.sample.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.StudentEntity;
import com.sample.StudentService.StudentService;

@RestController
@RequestMapping(value="/Student")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/postAllStudent")
	public String postAllStudent(@RequestBody List<StudentEntity> e) throws Exception {
		return ss.postAllStudent(e);
	}
	
	@GetMapping(value="/getAll")
	public List<StudentEntity>getAll(){
		return ss.getAll();
	}

}
