package springboot.springhibernaterest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.springhibernaterest.entity.Employee;
import springboot.springhibernaterest.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeService service;
	
	@Autowired
	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/employee")
	public List<Employee> findAll() 
	{
		return service.findAll();
	}
	
	
	@RequestMapping("/employee/{theId}")
	public Employee getEmployeeById(@PathVariable int theId) throws IdNotFoundException
	{
		Employee employee=service.findEmployeeById(theId);
		
		if(employee==null)
		{
			throw new IdNotFoundException("no such employee found with id: "+theId);
		}
		return employee;
	}

	@DeleteMapping("/employee/{theId}")
	public void deleteEmployee(@PathVariable int theId) throws IdNotFoundException
	{ 
		Employee employee = service.findEmployeeById(theId);
		service.deleteEmployee(theId);
		
		if(employee==null)
		{
			throw new IdNotFoundException("no such employee found with id: "+theId);
		}
	 		
	}
	
	@PostMapping("/employee")
	public void saveEmployee(@RequestBody Employee theEmployee)
	{
		theEmployee.setId(0);
		service.saveEmployee(theEmployee);
		
	}
	
    @PutMapping("/employee")
	public Employee updateemployee(@RequestBody Employee theEmployee)
	{
		 service.saveEmployee(theEmployee);
		 
		 return theEmployee;
	}
	
	
	
}

