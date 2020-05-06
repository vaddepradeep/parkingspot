package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.SlotReleseDto;
import com.demo.dto.SpotRequestDto;

@RestController
public  class SpotController {
	@PostMapping
	public  String relesespot(@RequestBody SlotReleseDto spotrelese)
	{
		return null;
		
	}
	
String requestSpot(@RequestBody SpotRequestDto spotrequest )
{
	return null;
	
}
}
