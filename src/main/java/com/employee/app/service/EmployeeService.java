package com.employee.app.service;

import java.util.List;

import com.employee.app.domain.Employee;

public interface EmployeeService {

	public Employee addNewEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(Long id);

	public Employee getEmployee(Long id);

	public List<Employee> findAllEmployee();
}
