package com.pack.employee.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.employee.dao.DaoImp;
import com.pack.employee.models.Employee;
@Repository
public class EmpRepository {
	private final DaoImp dao;
	
	@Autowired
	public EmpRepository(DaoImp dao) {
		this.dao=dao;
	}
	
	public ArrayList<Employee> getAllEmployees(){
		return dao.employeelist();
	}

}
