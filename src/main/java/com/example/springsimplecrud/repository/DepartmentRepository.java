package com.example.springsimplecrud.repository;

import com.example.springsimplecrud.entity.Department;
import com.example.springsimplecrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
