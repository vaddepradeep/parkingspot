package com.example.democontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.SpotRequestDTO;

public class RaffelController {
	@Autowired
	SpotRequestsService spotRequestsService;
	
	@GetMapping("/test")
	public ResponseEntity<String> test(SpotRequestDTO spotRequestDTO) {
		return new ResponseEntity<String>("test", HttpStatus.OK);
	}

	@PostMapping("/spotRequest")
	public ResponseEntity<String> spotRequest(SpotRequestDTO spotRequestDTO) {
		return new ResponseEntity<String>(spotRequestsService.spotRequest(spotRequestDTO), HttpStatus.OK);

}
}