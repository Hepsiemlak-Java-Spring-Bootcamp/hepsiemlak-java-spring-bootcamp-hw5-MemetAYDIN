package com.mehmetaydin.router.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmetaydin.router.dto.request.HospitalRequest;
import com.mehmetaydin.router.dto.response.HospitalResponse;
import com.mehmetaydin.router.dto.response.SchoolRepsonse;
import com.mehmetaydin.router.service.RouterService;

@RestController
public class Controller {

	@Autowired
	private RouterService service;
	
	
	
	@GetMapping(value="/school")
	public ResponseEntity<List<SchoolRepsonse>> getAllSchool(){
		return new ResponseEntity<>(service.getAllSchool(),HttpStatus.OK);
	}
	
	@PostMapping(value = "/school")
	public ResponseEntity<SchoolRepsonse> saveSchool(@RequestBody SchoolRepsonse schoolRequest){
		return new ResponseEntity<>(service.saveSchool(schoolRequest),HttpStatus.OK);
	}
	
	@GetMapping(value ="/hospital")
	public ResponseEntity<List<HospitalResponse>> getAllHospital(){
		return new ResponseEntity<>(service.getAllHospital(),HttpStatus.OK);
	}
	@PostMapping(valu="/hospital")
	public ResponseEntity<List<HospitalResponse>> saveHospital(@RequestBody HospitalRequest hospitalRequest){
		return new ResponseEntity<>(service.saveHospital(hospitalRequest),HttpStatus.OK);
	}
}
