package com.hr.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.mgmt.constant.EmpConstant;
import com.hr.mgmt.service.IEmployeesService;

@RestController
@CrossOrigin
@RequestMapping(EmpConstant.TOP_LEVEL_RM)
public class HomeController {
	
	@Autowired
	IEmployeesService iEmployeesService;
	
	
	//Get a employee details using employee id.
	//Sample request url : localhost:7070/hr/api/109
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployeeDetails(@PathVariable int id){
		
		System.out.println("***********Controller********** : "+id);
		
		return ResponseEntity.ok(iEmployeesService.getEmployeeByEmpId(id));
	}
	//This method will pull all employees from database.
	@GetMapping(EmpConstant.GET_ALL_EMPLOYEES)
	public ResponseEntity<?> getAllEmployeesDetails(){
		return ResponseEntity.ok(iEmployeesService.GetAllEmployees());
	}
	
	

}
