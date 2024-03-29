package springboot.jpa_rest.dao;

import java.util.List;

import springboot.jpa_rest.entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> findAll();
	
	public Employee findEmployeeById(int theId);
   
	public void deleteEmployee(int theId);
	
	public Employee saveEmployee(Employee theEmployee);
	
	
}
