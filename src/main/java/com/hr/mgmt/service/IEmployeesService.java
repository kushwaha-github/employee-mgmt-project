package com.hr.mgmt.service;

import java.util.List;

import com.hr.mgmt.entity.Employees;

public interface IEmployeesService {
	
	public Employees getEmployeeByEmpId(int id);
	public List<Employees> GetAllEmployees();

}
