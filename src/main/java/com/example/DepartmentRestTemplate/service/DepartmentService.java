package com.example.DepartmentRestTemplate.service;

import com.example.DepartmentRestTemplate.entity.DepartmentDto;

public interface DepartmentService {
	
    DepartmentDto saveDepartment(DepartmentDto department);

    DepartmentDto getDepartmentById(int departmentId);
}

