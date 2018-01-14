package com.paytm.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paytm.ems.domain.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long> {

}
