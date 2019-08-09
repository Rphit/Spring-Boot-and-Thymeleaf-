package comm.springboot.springbootthymeleaf.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String sayHello( Model theModel)
	{  
		theModel.addAttribute("theDate", new Date(0));
		
		return "hello-world";
	}
}
