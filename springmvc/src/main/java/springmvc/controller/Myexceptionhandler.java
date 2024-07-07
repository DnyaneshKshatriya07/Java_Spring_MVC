package springmvc.controller;

import java.text.NumberFormat;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class Myexceptionhandler {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull(Model model)
	{		
		model.addAttribute("msg","Null Pointer Exception Ouccered...");
		return "error_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNumber(Model model)
	{		
		model.addAttribute("msg","Number Format Exception Ouccered...");
		return "error_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandler(Model model)
	{		
		model.addAttribute("msg","Exception Ouccered...");
		return "error_page";
	}
}
