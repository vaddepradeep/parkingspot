package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SpotRequestDTO;
import com.example.demo.dao.SpotRequest;
import com.example.demo.repo.Emprepo;
import com.example.demo.repo.Spotrepo;

@Service
public class SpotRequestsServiceImpl {
	@Autowired
	private Emprepo employeeRepo;

	@Autowired
	private Spotrepo spotRequestRepo;

	public String spotRequest(SpotRequestDTO spotRequestDTO) {

		spotRequestRepo.save(SpotRequest.builder().requestedForDate(spotRequestDTO.getRequestedForDate())
				.emmployee(employeeRepo.findById(spotRequestDTO.getEmpId()).get()).build());
		
		return "Spot request submitted";

}
}
