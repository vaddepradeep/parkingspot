package com.example.demo;

import java.time.LocalDate;

public class SpotRequestDTO {
	private int empId;
	private LocalDate requestedForDate;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public LocalDate getRequestedForDate() {
		return requestedForDate;
	}
	public void setRequestedForDate(LocalDate requestedForDate) {
		this.requestedForDate = requestedForDate;
	}
	public SpotRequestDTO(int empId, LocalDate requestedForDate) {
		super();
		this.empId = empId;
		this.requestedForDate = requestedForDate;
	

}
	public SpotRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
