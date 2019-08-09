package springboot.springhibernaterest.dao;

import java.util.List;


import springboot.springhibernaterest.entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> findAll();
	
	public Employee findEmployeeById(int theId);
   
	public void deleteEmployee(int theId);
	
	public void saveEmployee(Employee theEmployee);
	
	
}
