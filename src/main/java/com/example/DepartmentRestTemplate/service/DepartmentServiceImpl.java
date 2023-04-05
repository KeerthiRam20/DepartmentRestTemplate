package com.example.DepartmentRestTemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DepartmentRestTemplate.Repository.IDepartmentRepository;
import com.example.DepartmentRestTemplate.entity.DepartmentDto;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto department) {
        return departmentRepository.save(department);
    }

    @Override
    public DepartmentDto getDepartmentById(int departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}