package com.mehmetaydin.router.dto.response;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalResponse {

	private String hospitalName;
	private boolean vacine;
}
