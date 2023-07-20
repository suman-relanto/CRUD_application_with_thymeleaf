package com.springboot.application.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.springboot.application.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(long id);

	void deleteEmployeeById(long id);

	Page<Employee> findPaginated(int pageNo, int pageSize);
}
