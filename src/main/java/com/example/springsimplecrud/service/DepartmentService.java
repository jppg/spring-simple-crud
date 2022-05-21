package com.example.springsimplecrud.service;

import com.example.springsimplecrud.entity.Department;
import com.example.springsimplecrud.entity.User;
import com.example.springsimplecrud.repository.DepartmentRepository;
import com.example.springsimplecrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department dep) {
        return departmentRepository.save(dep);
    }

    public List<Department> getAll() {
        return departmentRepository.findAll();
    }
}
