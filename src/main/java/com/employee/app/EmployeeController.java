package com.employee.app;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.app.domain.Employee;
import com.employee.app.service.EmployeeService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class EmployeeController {

	private EmployeeService employeeService;

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Welcome to Employee Management");
		return "welcome";
	}

	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.addNewEmployee(employee);
	}

	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}

}
