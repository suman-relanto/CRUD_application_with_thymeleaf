package com.springboot.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.application.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
