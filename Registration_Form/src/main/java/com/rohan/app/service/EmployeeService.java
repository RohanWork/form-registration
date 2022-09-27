package com.rohan.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohan.app.entity.Employee;
import com.rohan.app.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public Iterable<Employee> listAll(){
		return this.repo.findAll(); 
	}
	
	public void saveOrUpdate(Employee employee){
		repo.save(employee);
	}
	
	public Employee getEmployeeById(long id) {
		return this.repo.findById(id).get();
	}
	
	public void update(Employee employee, int id) {
		repo.save(employee);
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
} 
