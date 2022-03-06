package com.mehmetaydin.router.dto.response;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolRepsonse {
	private int schoolNo;
	private String phone;
	private boolean isVacine;
}
