package com.paytm.ems.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.paytm.ems.domain.Employee;
import com.paytm.ems.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("app")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("create-employee")
	public ModelAndView createUserView() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("emp-creation");
		mav.addObject("employee", new Employee());
		 mav.addObject("allProfiles", getProfiles());
		return mav;
	}

	@PostMapping(value = "create-employee")
	public ModelAndView saveEmployee(@Valid Employee employee, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			log.info("Validation errors while submitting form.");
			mav.setViewName("emp-creation");
			mav.addObject("employee", employee);
			mav.addObject("allProfiles", getProfiles());
			return mav;
		}
		employeeService.addNewEmployee(employee);
		mav.addObject("employees", employeeService.findAllEmployee());
		mav.setViewName("emp-info");
		log.info("Form submitted successfully.");
		return mav;
	}

	private List<String> getProfiles() {
		List<String> list = new ArrayList<>();
		list.add("Developer");
		list.add("Manager");
		list.add("Director");
		return list;
	}
}
