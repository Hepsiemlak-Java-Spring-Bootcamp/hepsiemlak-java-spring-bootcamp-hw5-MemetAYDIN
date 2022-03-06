package com.mehmetaydin.router.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.mehmetaydin.router.dto.response.HospitalResponse;
import com.mehmetaydin.router.dto.response.SchoolRepsonse;
import com.mehmetaydin.router.model.Hospital;
import com.mehmetaydin.router.model.School;
import com.mehmetaydin.router.repository.RouterHospitalRepository;
import com.mehmetaydin.router.repository.RouterSchoolRepository;

public class RouterService {

	
	@Autowired
	RouterHospitalRepository routeHospital;
	
	@Autowired
	RouterSchoolRepository routeSchool;
	
	
	public List<HospitalResponse> getAllHospital(){
		List<HospitalResponse> hospitalResponse=new ArrayList<>();
		for(Hospital hospital:routeHospital.findAll()) {
			hospitalResponse.add(convertToHospitalResponse(hospital));
		}
		return hospitalResponse;
	}
	

	
	private Object convertToSchool() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SchoolRepsonse> getAllSchool(){
		List<SchoolRepsonse> schoolResponse=new ArrayList<>();
		for(School school:routeSchool.findAll()) {
			schoolResponse.add(convertToSchoolResponse(school));
		}
		return schoolResponse;
	}


	private SchoolRepsonse convertToSchoolResponse(School school) {
		SchoolRepsonse schoolRepsonse=new SchoolRepsonse();
		schoolRepsonse.setPhone(school.getPhone());
		schoolRepsonse.setSchoolNo(school.getSchoolNo());
		schoolRepsonse.setVacine(school.isVacine());
		return schoolRepsonse;
	}



	private HospitalResponse convertToHospitalResponse(Hospital hospital) {
		HospitalResponse response = new HospitalResponse();
		response.setVacine(hospital.isVacine());

		return response;
	}




	
	
}
