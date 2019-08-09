package comm.student.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import comm.student.springbootthymeleaf.entity.Student;

@Controller
public class StudentController {
	
	@GetMapping("/students")
	public String showData(Model theModel,Student stud)
	{
		Student student= new Student(1,"rohit","indore"); 
		theModel.addAttribute("student",student );
				return "student";
	}
	

	
	

}
