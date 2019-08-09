package comm.example.springbootthymeleaftwo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.example.springbootthymeleaftwo.entity.Student;
import comm.example.springbootthymeleaftwo.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	private StudentService service;
	
	
	@Autowired
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/list")
	public String showStudent(Model theModel)
	{
		
		theModel.addAttribute("studentList", service.findAll());
		return "student-page";
	}
	
	@RequestMapping("/addPage")
	public String addStudent(Model theModel)
	{
		Student studd = new Student();
		theModel.addAttribute("studentt",studd);
		return "add-page";
	}
	
	@RequestMapping("/save")
	public String showSaved(@ModelAttribute("studentt") Student stud)
	{
		service.save(stud);
		return "redirect:/students/list";
	}
	

	
}
