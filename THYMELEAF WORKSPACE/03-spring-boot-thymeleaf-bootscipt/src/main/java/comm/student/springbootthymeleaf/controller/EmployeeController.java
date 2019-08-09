package comm.student.springbootthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.student.springbootthymeleaf.entity.Employee;


@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private List<Employee> emplist;
	
	@PostConstruct
	public void initEmployee()
	{
		
		emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"rohit","indore"));
		emplist.add(new Employee(2,"mohit","indore"));
		emplist.add(new Employee(3,"sohit","indore"));
	}
	@GetMapping("/list")
	public String getAllEmployee(Model theModel)
	{
		theModel.addAttribute("empList", emplist);
		return "employee-list";
	}
	

	
	

}
