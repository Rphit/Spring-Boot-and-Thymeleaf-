package comm.example.springbootthymeleaftwo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comm.example.springbootthymeleaftwo.entity.Employee;
import comm.example.springbootthymeleaftwo.service.EmployeeService;


@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// get employees from db
		List<Employee> theEmployees = employeeService.findAll();
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "employees/list-employees";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Employee theEmployee = new Employee();
		
		theModel.addAttribute("employee", theEmployee);
		
		return "employees/employee-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,
									Model theModel) {
		
		// get the employee from the service
		Employee theEmployee = employeeService.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("employee", theEmployee);
		
		// send over to our form
		return "employees/employee-form";			
	}
	
	
	@PostMapping("/save")
	public String saveEmployee(
			@ModelAttribute("employee") @Valid Employee theEmployee,
			BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "employees/employee-form";
		}
		else {		
			// save the employee
			employeeService.save(theEmployee);
			
			// use a redirect to prevent duplicate submissions
			return "redirect:/employees/list";
		}
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId) {
		
		// delete the employee
		employeeService.deleteById(theId);
		
		// redirect to /employees/list
		return "redirect:/employees/list";
		
	}
	
	
	@GetMapping("/search")
	public String search(@RequestParam("firstName") String theFirstName,
						 @RequestParam("lastName") String theLastName,
						 Model theModel) {
		
		// check names, if both are empty then just give list of all employees

		if (theFirstName.trim().isEmpty() && theLastName.trim().isEmpty()) {
			return "redirect:/employees/list";
		}
		else {
			// else, search by first name and last name
			List<Employee> theEmployees =
							employeeService.searchBy(theFirstName, theLastName);
			
			// add to the spring model
			theModel.addAttribute("employees", theEmployees);
			
			// send to list-employees
			return "employees/list-employees";
		}
		
	}
}


















