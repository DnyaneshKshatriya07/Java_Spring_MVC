package springmvc.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import springmvc.model.User;

@Controller
public class FormController {
	
	@ModelAttribute
	public void commonDataForModel(Model m){
		m.addAttribute("tit","Fill Registation Form");
		m.addAttribute("desc","Home for programmer");
	}
	
	@RequestMapping("/form")
	public String showform(Model m){
		//This is repeated work then we use @ModelAttribute
//		m.addAttribute("tit","Fill Registation Form");
//		m.addAttribute("desc","Home for programmer");
		return "form";
	}

	//Without use of @ModelAttribute
//	@RequestMapping(path="/processform", method=RequestMethod.POST)
//	public String handleform(
//			@RequestParam("email") String userEmail, 
//			@RequestParam("name") String userName, 
//			@RequestParam("password") String userPassword, Model model)
//	{		
//		model.addAttribute("name",userName);
//		model.addAttribute("email",userEmail);
//		model.addAttribute("password",userPassword);
//		return "formSuccess";
//	}
	
	//With use of @ModelAttribute
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleform(@ModelAttribute User user, Model model)
	{		
		String abc=null;
		System.out.println(abc.length());
		return "formSuccess";
	}
	
	
//	//Exception handling using @ExceptionHandler
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandlerNull(Model model)
//	{		
//		model.addAttribute("msg","Exception Ouccered...");
//		return "error_page";
//	}
}
