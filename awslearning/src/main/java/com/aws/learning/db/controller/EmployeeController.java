package com.aws.learning.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.learning.db.entities.Employee;
import com.aws.learning.db.repository.EmployeeRepository;

@RestController
@RequestMapping(path = "/emplyees")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String addUser(@RequestBody Employee employee) {
		String finalOutcome = "{ \" outcome \" : \" failed \"}"; 
		System.out.println("########## Employee = " + employee);
		if (null != employee) {
			System.out.println("########## Employee = " + employee.toString());
			employeeRepository.save(employee);
			finalOutcome = finalOutcome.replace("failed", "saved");
		}
		System.out.println("########## finalOutcome = " + finalOutcome);
		return finalOutcome;
	}
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Iterable<Employee> getAllEmployees() {
		System.out.println("########## getAllEmployees started ");
		return employeeRepository.findAll();
	}
}
