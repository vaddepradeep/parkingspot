package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.EmpyoyeeDao;

public interface Emprepo  extends JpaRepository<EmpyoyeeDao, Integer> {

}
