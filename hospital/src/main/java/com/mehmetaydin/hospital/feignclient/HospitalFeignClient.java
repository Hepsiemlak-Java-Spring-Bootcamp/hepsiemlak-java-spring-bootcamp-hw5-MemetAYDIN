package com.mehmetaydin.hospital.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mehmetaydin.hospital.client.SchoolRequest;
import com.mehmetaydin.hospital.client.SchoolResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HospitalFeignClient {

	@FeignClient(value = "School", url = "http://localhost:8081/school")
	interface HospitalFeign {

		@PostMapping(value = "/school")
		ResponseEntity<SchoolResponse> saveBanner(@RequestBody SchoolRequest request);

	}
}
