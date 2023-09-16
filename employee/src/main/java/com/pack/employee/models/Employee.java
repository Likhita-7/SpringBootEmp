package com.pack.employee.models;

public class Employee {
	int employeenumber;
	String name;
	String job;
	double salary;
	int deptno;
	public int getEmployeenumber() {
		return employeenumber;
	}
	public void setEmployeenumber(int employeenumber) {
		this.employeenumber = employeenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [employeenumber=" + employeenumber + ", name=" + name + ", job=" + job + ", salary=" + salary
				+ ", deptno=" + deptno + "]";
	}

}
