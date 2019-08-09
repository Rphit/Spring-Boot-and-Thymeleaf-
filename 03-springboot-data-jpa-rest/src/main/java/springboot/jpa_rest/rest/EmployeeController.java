package springboot.jpa_rest.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.jpa_rest.entity.Employee;
import springboot.jpa_rest.service.EmployeeService;

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
	public Optional<Employee> getEmployeeById(@PathVariable int theId) throws IdNotFoundException 
	{
		Optional<Employee> employee=service.findEmployeeById(theId);
		
		if(!employee.isPresent())
		{
			throw new IdNotFoundException("no such employee found with id: "+theId);
		}
		return employee;
	}

	@DeleteMapping("/employee/{theId}")
	public void deleteEmployee(@PathVariable int theId) throws IdNotFoundException
	{
		Optional<Employee> employee = service.findEmployeeById(theId);
	
		if(!employee.isPresent())
		{
		throw new IdNotFoundException("no such employee found with id: "+theId);
		}	
		 service.deleteEmployee(theId);
	}
	

	@PutMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee theEmployee)
	{
		
		return service.saveEmployee(theEmployee);
		
		
	}
	
 
	
	
}

