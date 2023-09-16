package com.pack.employee.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pack.employee.models.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setEmployeenumber(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setJob(rs.getString(3));
		e.setSalary(rs.getDouble(4));
		e.setDeptno(rs.getInt(5));
		
		System.out.println(e.toString());
		
		return e;
	}

}
