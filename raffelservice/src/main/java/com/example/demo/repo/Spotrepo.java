package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.SpotRequest;

public interface Spotrepo  extends JpaRepository<SpotRequest, Integer>{

}
