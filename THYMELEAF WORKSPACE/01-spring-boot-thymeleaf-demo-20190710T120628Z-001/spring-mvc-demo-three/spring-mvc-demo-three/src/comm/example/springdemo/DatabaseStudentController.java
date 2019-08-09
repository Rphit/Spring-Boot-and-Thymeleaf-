package comm.example.springdemo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/database")
public class DatabaseStudentController {
	@Autowired
	private StudentDaoImpl dao;
	
	
	@RequestMapping("/showForm")
	public String showPage( Model theModel)
	
	{
		Student student=new Student();
		theModel.addAttribute("student",student);
		
		return "student-form";
	}
	@RequestMapping("/save")
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		dao.createStudent(student);
		
		//return "process-form";
		return "redirect:/database/displayAll";
	}
	
	@RequestMapping("/displayAll")
	public String getAllStudent(Model theModel)

	{
		List<Student> l=dao.getAll();
		theModel.addAttribute("list",l);
		return "students";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) 
	{
		dao.deleteById(id);
		return "redirect:/database/displayAll";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, @ModelAttribute("student") Student student, Model theModel) 
	{
		theModel.addAttribute("id", id);
		return "update-form";
	}
	
	@RequestMapping("/updatedForm")
	public String updateById(@ModelAttribute("student") Student student) 
	{
		dao.updateById(student);
		return "redirect:/database/displayAll";
	}
}
