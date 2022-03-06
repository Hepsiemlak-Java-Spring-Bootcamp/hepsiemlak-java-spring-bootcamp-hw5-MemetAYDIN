package com.mehmetaydin.school.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmetaydin.school.dto.RouterSchoolRequest;
import com.mehmetaydin.school.dto.RouterSchoolResponse;
import com.mehmetaydin.school.service.SchoolService;



@RestController
public class SchoolController {

	
	@Autowired
	private SchoolService schoolService;
	
	
	@GetMapping(value = "/school")
	public ResponseEntity<List<RouterSchoolResponse>> getAllSchool(){
		return new ResponseEntity<>(schoolService.getAllSchools(),HttpStatus.OK);
	}
	
	@PostMapping(value = "/school")
	public ResponseEntity<RouterSchoolResponse> saveSchool(@RequestBody RouterSchoolRequest schoolRequest){
		return new ResponseEntity<>(schoolService.saveSchool(schoolRequest),HttpStatus.OK);
	}
	

}
