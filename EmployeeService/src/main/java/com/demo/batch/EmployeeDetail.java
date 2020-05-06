package com.demo.batch;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetail {
	@Id
	private int id;
	private String ename;
	
	private String phoneNumber;
	private String designation;
	private String  experience;
	private int lotid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getLotid() {
		return lotid;
	}
	public void setLotid(int lotid) {
		this.lotid = lotid;
	}

}
