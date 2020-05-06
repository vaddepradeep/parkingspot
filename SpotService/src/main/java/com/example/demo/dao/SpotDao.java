package com.example.demo.dao;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class SpotDao {
	private int id;
	private int wing;
	private int block;
	private String locatation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	public String getLocatation() {
		return locatation;
	}
	public void setLocatation(String locatation) {
		this.locatation = locatation;
	}

}
