package com.example.springsimplecrud.controller;

import com.example.springsimplecrud.entity.Department;
import com.example.springsimplecrud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping
    public Department saveDep(@RequestBody Department dep)
    {
        return departmentService.save(dep);
    }

    @GetMapping
    public List<Department> getAll()
    {
        return departmentService.getAll();
    }
}
