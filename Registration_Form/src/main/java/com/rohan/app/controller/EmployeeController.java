package com.rohan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohan.app.entity.Employee;
import com.rohan.app.service.EmployeeService;

@RestController
@CrossOrigin(origins="*")
public class EmployeeController {

	@Autowired
	private EmployeeService services;
	
	@GetMapping("/")
	public Iterable<Employee>getEmployee(){
		return services.listAll();
	}
	
	@PostMapping(value="/save")
	private long saveEmployee(@RequestBody Employee employee) {
		services.saveOrUpdate(employee);
		return employee.getId();
	}
	
	@RequestMapping("/employee/{id}")
	private Employee getEmployee(@PathVariable(name="id") int employeeId) {
		return services.getEmployeeById(employeeId);
	}
	
	@PutMapping("/edit/{id}")
	private Employee update(@RequestBody Employee employee, @PathVariable(name="id") int employeeId) {
		employee.setId(employeeId);
		services.saveOrUpdate(employee);
		return employee;
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteEmployee(@PathVariable(name="id") int employeeId) {
		services.delete(employeeId);
	}
	
}
