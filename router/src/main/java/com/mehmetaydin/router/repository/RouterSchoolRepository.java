package com.mehmetaydin.router.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmetaydin.router.model.School;

public interface RouterSchoolRepository extends JpaRepository<School, Integer> {

}
