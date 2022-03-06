package com.mehmetaydin.router.model;

import javax.persistence.Entity;


import lombok.Data;

@Data
@Entity
public class School {

	private int schoolNo;
	private String phone;
	private String schoolName;
	private boolean isVacine;
	
}