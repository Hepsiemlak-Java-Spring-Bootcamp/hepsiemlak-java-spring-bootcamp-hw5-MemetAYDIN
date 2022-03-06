package com.mehmetaydin.hospital.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmetaydin.hospital.dto.RouterHospitalRequest;
import com.mehmetaydin.hospital.dto.RouterHospitalResponse;
import com.mehmetaydin.hospital.model.Hospital;
import com.mehmetaydin.hospital.repository.HospitalRepository;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HospitalService {
	
	@Autowired
	private HospitalRepository hospitalRepository;
	
	
	protected RouterHospitalResponse convertToAdvertResponse(Hospital savedHospital) {
		
		RouterHospitalResponse response = new RouterHospitalResponse();
		response.setHospitalName(savedHospital.getHospitalName());
		response.setVacine(savedHospital.isVacine());

		return response;
		
	}
	
	public List<RouterHospitalResponse> getAllHospital(){
		List<RouterHospitalResponse> hospitalList=new ArrayList<>();
		for(Hospital hospital:hospitalRepository.findAll()) {
			hospitalList.add(convertToAdvertResponse(hospital));
		}
		return hospitalList;
		
	}
	
	public RouterHospitalResponse getHospitalByID(int hospitalId) {
		Optional<Hospital> hospital=hospitalRepository.findById(hospitalId);
		
		return convertToAdvertResponse(hospital.get());
	}
	


}
