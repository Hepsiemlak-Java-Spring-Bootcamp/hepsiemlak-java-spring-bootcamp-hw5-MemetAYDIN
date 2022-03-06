package com.mehmetaydin.router.dto.request;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolRequest {

	private int schoolNo;
	private String phone;
	private boolean isVacine;
}
