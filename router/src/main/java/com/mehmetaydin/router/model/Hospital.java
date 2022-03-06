package com.mehmetaydin.router.model;

import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Hospital {

	private int hospitalID;
	private String hospitalName;
	private boolean vacine;
	
}