package com.example.springboot.springbootthymeleafdemo.service;

import java.util.List;

import com.example.springboot.springbootthymeleafdemo.entity.Employee;



public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

	public List<Employee> searchBy(String theFirstName, String theLastName);
	
}
