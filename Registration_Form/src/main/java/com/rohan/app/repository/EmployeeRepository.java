package com.rohan.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rohan.app.entity.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Long> {

}
