package com.hr.mgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mgmt.entity.Employees;
import com.hr.mgmt.repository.IEmployees;

@Service
public class EmployeesServiceImpl implements IEmployeesService {
	
	@Autowired
	IEmployees iEmployees;

	@Override
	public Employees getEmployeeByEmpId(int id) {
		
		System.out.println("***********Service**********  "+id);
		System.out.println(iEmployees.findByEmployeeId(id).toString());
		
		return iEmployees.findByEmployeeId(id);
	}

	@Override
	public List<Employees> GetAllEmployees() {
		
		return iEmployees.findAll();
	}

}
