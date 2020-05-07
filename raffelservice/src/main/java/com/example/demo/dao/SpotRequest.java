package com.example.demo.dao;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SpotRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "requested_for_date")
	private LocalDate requestedForDate;

	@ManyToOne()
	@JoinColumn(name = "emp_id")
	private EmpyoyeeDao emmployee;

	public SpotRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpotRequest(Integer id, LocalDate requestedForDate, EmpyoyeeDao emmployee) {
		super();
		this.id = id;
		this.requestedForDate = requestedForDate;
		this.emmployee = emmployee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getRequestedForDate() {
		return requestedForDate;
	}

	public void setRequestedForDate(LocalDate requestedForDate) {
		this.requestedForDate = requestedForDate;
	}

	public EmpyoyeeDao getEmmployee() {
		return emmployee;
	}

	public void setEmmployee(EmpyoyeeDao emmployee) {
		this.emmployee = emmployee;
	}

}
