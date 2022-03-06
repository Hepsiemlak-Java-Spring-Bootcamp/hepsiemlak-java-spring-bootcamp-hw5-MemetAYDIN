package com.mehmetaydin.router.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmetaydin.router.model.Hospital;

public interface RouterHospitalRepository extends JpaRepository<Hospital, Integer>{

}
