package com.mehmetaydin.router.dto.request;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalRequest {
	private String hospitalName;
	private boolean vacine;
}
