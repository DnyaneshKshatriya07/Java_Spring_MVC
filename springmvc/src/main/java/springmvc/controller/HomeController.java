package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model){
		model.addAttribute("name","Dnyanesh Kshatriya");
		model.addAttribute("id",1234);
		List<String> friends=new ArrayList<String>();
		friends.add("Nayan");
		friends.add("ayush");
		friends.add("Mohit");
		model.addAttribute("f",friends);
		System.out.println("This is our home page");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(){
		System.out.println("This is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Kunal");
		modelAndView.addObject("rollnumber",12);
		modelAndView.setViewName("help");
		
		System.out.println("This is help page");
		return modelAndView;
	}
}
