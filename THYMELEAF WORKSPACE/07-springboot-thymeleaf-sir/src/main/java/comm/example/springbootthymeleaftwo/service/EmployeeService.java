package comm.example.springbootthymeleaftwo.service;

import java.util.List;

import comm.example.springbootthymeleaftwo.entity.Employee;





public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

	public List<Employee> searchBy(String theFirstName, String theLastName);
	
}
