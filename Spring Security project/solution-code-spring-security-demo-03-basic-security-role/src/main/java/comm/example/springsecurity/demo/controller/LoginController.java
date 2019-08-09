package comm.example.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage()
	{
		return "login";
	}
	
	@GetMapping("/systems")
	public String goToAdmin()
	{
		return "systems";
	}
   
	 @GetMapping("/managers")
   public String goToManager()
   {
	   return"managers";
   }
	 @GetMapping("/access")
	 public String goToError()
	 {
		 return"home";
	 }
}
