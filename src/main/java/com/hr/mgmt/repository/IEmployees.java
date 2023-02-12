package com.hr.mgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.mgmt.entity.Employees;

@Repository
public interface IEmployees extends JpaRepository<Employees,Integer> {
	
	public Employees findByEmployeeId(int employeeId);
	public List<Employees> findAll();

}
