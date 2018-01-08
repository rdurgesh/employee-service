package com.employee.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.domain.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long> {

}
