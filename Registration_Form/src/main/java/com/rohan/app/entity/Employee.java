package com.rohan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="city")
	private String city;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="salary")
	private String salary;

	public Employee(long id, String fname, String lname, String city, String phone, String salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.phone = phone;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}
