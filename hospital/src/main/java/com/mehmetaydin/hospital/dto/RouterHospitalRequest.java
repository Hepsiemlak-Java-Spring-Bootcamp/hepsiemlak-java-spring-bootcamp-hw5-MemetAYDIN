package com.mehmetaydin.hospital.dto;

import com.mehmetaydin.hospital.client.SchoolRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouterHospitalRequest {

	private String hospitalName;
	private boolean vacine;
}
