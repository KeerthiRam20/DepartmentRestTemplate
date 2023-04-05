package com.example.DepartmentRestTemplate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DepartmentRestTemplate.entity.DepartmentDto;


@Repository
public interface IDepartmentRepository extends JpaRepository<DepartmentDto, Integer> {
	
	
	}

