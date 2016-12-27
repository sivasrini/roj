package com.repositoryofjewels.controller;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rojbackend.model.Register;




@Controller
public class HomeController {
	
public HomeController()
{
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.rojbackend.config");
    // context.refresh();

 	System.out.println("before refresh");
}
	
	@RequestMapping(value={"/","/index"})
	public String show()
	{
		return "index";
	}

	@ModelAttribute(name="reg")
public Register prdt(){
		
		return new Register();
	}
	
	@RequestMapping("/aboutus")
	public String show1()
	{
		
		return "aboutus";
	}
	@RequestMapping("/contactus")
	public String show2()
	{
		
		return "contactus";
	}
	@RequestMapping("/login")
	public String show4()
	{
		
		return "login";
	}
	@RequestMapping("/loginsuccess")
	public String show5()
	{
		
		return "index";
	}
	@RequestMapping("/register")
	public String show6()
	{
		
		return "register";
	}
	


}
