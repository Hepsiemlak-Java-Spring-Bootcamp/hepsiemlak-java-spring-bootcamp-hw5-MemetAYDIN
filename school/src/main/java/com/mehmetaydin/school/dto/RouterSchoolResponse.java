package com.mehmetaydin.school.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouterSchoolResponse {
	private int schoolNo;
	private String phone;
	private String schoolName;
	private boolean isVacine;
}
