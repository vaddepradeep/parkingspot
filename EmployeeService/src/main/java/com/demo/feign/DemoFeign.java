package com.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "")
public interface DemoFeign {
	@GetMapping("/check/{vtype}")
	String Avilabulity(@PathVariable("vtype") String v);

}
