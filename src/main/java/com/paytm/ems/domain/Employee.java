package com.paytm.ems.domain;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue(strategy = AUTO)
	private Long employeeId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "AGE")
	private Long age;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "MARRIED")
	private Boolean married;
	
	@Column(name = "PROFILE")
	private String profile;

	@Column(name = "SALARY")
	private Long salary;

	@Column(name = "ADDRESS")
	private String address;
}
