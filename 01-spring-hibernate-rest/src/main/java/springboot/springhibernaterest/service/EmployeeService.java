package springboot.springhibernaterest.service;

import java.util.List;

import springboot.springhibernaterest.entity.Employee;

public interface EmployeeService {
	
    public List<Employee> findAll();
	
	public Employee findEmployeeById(int theId);

	public void deleteEmployee(int theId);
	
	public void saveEmployee(Employee theEmployee);
}
