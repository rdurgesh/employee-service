package com.paytm.ems.service;

import java.util.List;

import com.paytm.ems.domain.Employee;

public interface EmployeeService {

	public Employee addNewEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(Long employeeId);

	public Employee getEmployee(Long employeeId);

	public List<Employee> findAllEmployee();
}
