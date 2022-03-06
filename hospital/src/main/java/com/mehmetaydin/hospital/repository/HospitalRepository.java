package com.mehmetaydin.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmetaydin.hospital.model.Hospital;


public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
