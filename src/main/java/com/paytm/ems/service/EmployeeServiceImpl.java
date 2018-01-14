package com.paytm.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paytm.ems.domain.Employee;
import com.paytm.ems.repository.EmpRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private final EmpRepository empRepository;

	@Override
	public Employee addNewEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		empRepository.delete(id);
	}

	@Override
	public Employee getEmployee(Long id) {
		return empRepository.findOne(id);
	}

	@Override
	public List<Employee> findAllEmployee() {
		return empRepository.findAll();
	}

}
