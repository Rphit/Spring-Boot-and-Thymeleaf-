package springboot.jpa_rest.service;

import java.util.List;
import java.util.Optional;

import springboot.jpa_rest.entity.Employee;

public interface EmployeeService {
	
    public List<Employee> findAll();
	
	public Optional<Employee> findEmployeeById(int theId);

	public void deleteEmployee(int theId);
	
	public Employee saveEmployee(Employee theEmployee);
}
