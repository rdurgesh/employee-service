package com.paytm.ems.resources;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paytm.ems.domain.Employee;
import com.paytm.ems.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeResources {

	private EmployeeService employeeService;

	@PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.addNewEmployee(employee);
	}

	@PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/{employeeId}")
	public void deleteEmployee(@PathVariable Long employeeId) {
		employeeService.deleteEmployee(employeeId);
	}

	@GetMapping("/{employeeId}")
	public Employee getEmployee(@PathVariable Long employeeId) {
		return employeeService.getEmployee(employeeId);
	}

	@GetMapping(produces = APPLICATION_JSON_UTF8_VALUE)
	public List<Employee> gellAllEmployee() {
		return employeeService.findAllEmployee();
	}

}
