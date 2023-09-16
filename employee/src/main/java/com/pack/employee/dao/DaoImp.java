package com.pack.employee.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pack.employee.models.Employee;
import com.pack.employee.rowmapper.EmployeeMapper;



@Component
public class DaoImp implements Dao {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public DaoImp(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
	}

	@Override
	public ArrayList<Employee> employeelist() {
		String sql="SELECT * FROM employees ";
		return (ArrayList<Employee>) jdbcTemplate.query(sql, new EmployeeMapper());
	}
	
	
	
	
	
	

}
