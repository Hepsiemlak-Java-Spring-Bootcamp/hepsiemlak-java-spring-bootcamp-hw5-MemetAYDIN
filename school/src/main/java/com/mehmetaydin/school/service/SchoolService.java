package com.mehmetaydin.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmetaydin.school.dto.RouterSchoolRequest;
import com.mehmetaydin.school.dto.RouterSchoolResponse;
import com.mehmetaydin.school.model.School;
import com.mehmetaydin.school.repository.SchoolRepository;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	public List<RouterSchoolResponse> getAllSchools(){
		List<RouterSchoolResponse> schoolResponse=new ArrayList<>();
		for(School school:schoolRepository.findAll()) {
			schoolResponse.add(convertToSchoolResponse(school));
		}
		return schoolResponse;
	}
	
	public RouterSchoolResponse saveSchool(RouterSchoolRequest schoolRequest) {
		School school=schoolRepository.save(convertToSchoolResponse(schoolRequest));
		return convertToSchoolResponse(school);
	}

	private Object convertToSchoolResponse(RouterSchoolRequest schoolRequest) {
		School school=new School();
		school.setPhone(schoolRequest.getPhone());
		school.setSchoolName(schoolRequest.getSchoolName());
		school.setSchoolNo(schoolRequest.getSchoolNo());
		school.setVacine(schoolRequest.isVacine());
		return school;
	}

	private RouterSchoolResponse convertToSchoolResponse(School  school) {
		RouterSchoolResponse schoolResponse=new RouterSchoolResponse();
		schoolResponse.setSchoolNo(school.getSchoolNo());
		schoolResponse.setSchoolName(school.getSchoolName());
		schoolResponse.setVacine(school.isVacine());
		
		return schoolResponse;
	}
	

}
