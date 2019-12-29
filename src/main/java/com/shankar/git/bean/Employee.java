package com.shankar.git.bean;

public class Employee {
 int empId;
 String empName;
 String empCity;
 
public Employee(String empCity) {
	super();
	this.empCity = empCity;
}
public Employee(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpCity() {
	return empCity;
}
public void setEmpCity(String empCity) {
	this.empCity = empCity;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + "]";
}


 
}
