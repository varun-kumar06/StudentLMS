package com.sample.MarksheetController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.MarksheetEntity;
import com.sample.MarksheetService.MarksheetService;

@RestController
@RequestMapping(value="/MarkSheet")
public class MarksheetController {
	
	@Autowired
	MarksheetService mss;
	
	@PostMapping(value="/postAllMark")
   public String postAllMark(@RequestBody List<MarksheetEntity> ms) {
		
		return mss.postAllMark(ms);
	}
	
	@GetMapping(value="/getAllMark")
	
	public List<MarksheetEntity> getAllMark(){
		return mss.getAllMark();
	}

}
