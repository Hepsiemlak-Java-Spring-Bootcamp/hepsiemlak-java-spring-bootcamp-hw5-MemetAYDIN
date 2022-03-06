package com.mehmetaydin.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmetaydin.hospital.dto.RouterHospitalRequest;
import com.mehmetaydin.hospital.dto.RouterHospitalResponse;
import com.mehmetaydin.hospital.service.HospitalService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/hospitals")
@RequiredArgsConstructor
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping(value="/hospitals")
	public ResponseEntity<List<RouterHospitalResponse>> getAllHospitals(){
		return new ResponseEntity<>(hospitalService.getAllHospital(), HttpStatus.OK);
	}
	

	@GetMapping(value="/hospital/{hospitalNo}")
	public ResponseEntity<RouterHospitalResponse> getAdvertById(@PathVariable(required = false) int hospitalNo){
		return new ResponseEntity<>(hospitalService.getHospitalByID(hospitalNo), HttpStatus.OK);
	}
	
	
}
