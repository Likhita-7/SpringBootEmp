package com.pack.employee.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.employee.models.Employee;
import com.pack.employee.repository.EmpRepository;

@RestController
public class EmpController {
	private final EmpRepository rep;
	
	@Autowired
	public EmpController(EmpRepository rep) {
		this.rep=rep;
	}
	
	
	@GetMapping(value="/employees")
	public ArrayList<Employee> getAllEmp(){
		return rep.getAllEmployees();		
	}
	

}
