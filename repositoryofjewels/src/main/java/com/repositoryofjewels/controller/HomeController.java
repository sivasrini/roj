package com.repositoryofjewels.controller;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.rojbackend.DAO.AppDAOImple;
import com.rojbackend.DAO.RegisterDAOImple;
import com.rojbackend.model.AppModel;
import com.rojbackend.model.Register;




@Controller
public class HomeController {
	
	RegisterDAOImple ob;
	AppDAOImple obj;
	
public HomeController()
{
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.rojbackend.config");
    //context.refresh();

 	System.out.println("before refresh");
 	ob=(RegisterDAOImple) context.getBean("RegisterDAOImple");
 	
 	obj=(AppDAOImple) context.getBean("AppDAOImple");
	
}
	
	@RequestMapping(value={"/","/index"})
	public String show()
	{
		return "index";
	}

	@ModelAttribute("reg")
public Register prdt(){
		
		return new Register();
	}
	@ModelAttribute("prdt")
	public AppModel prdt1(){
		
		
			
			return new AppModel();
			
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
	public String show7()
	{
		
		return "register";
	}
	
	@RequestMapping("/add")
	public ModelAndView show6(@Valid @ModelAttribute("Register") Register register,BindingResult result,Model model1)
	{
		if(result.hasErrors())
		{
	ModelAndView model=new ModelAndView("register");
	
			model1.addAttribute("errors", result);
			return model;
		}
		else
		{
			
			ob.adduser(register);
			ModelAndView model=new ModelAndView("login");
		    return model;
		}
	}
	
	@RequestMapping(value={"/admin"})
	public String show8()
	{
		
		return "admin";
	}
	@RequestMapping(value={"/product"})
	public String show10()
	{
		
		return "product";
	}
	
	@RequestMapping("/productdetails")
	public ModelAndView show9(@ModelAttribute("AppModel") AppModel appmodel,MultipartFile FileDetails)
	
	{
		obj.addname(appmodel);
		FileDetails=appmodel.getFileDetails();
		System.out.println(FileDetails);
       ModelAndView model=new ModelAndView("productdetails");
        String uploadlocation="C:/Users/admin/git/roj/repositoryofjewels/src/main/webapp/resources/filedetails/" +appmodel.getId();
		try
		{
			
			FileOutputStream out=new FileOutputStream(new File(uploadlocation));
			
			
			byte[] bytes=new byte[1048576];
		
			
			bytes=FileDetails.getBytes();
				out.write(bytes);
		
		out.close();
			
		}
	catch(IOException e)
	{
		
		e.printStackTrace();
	}
		
		
		return model;
		
		
		
	}
	@RequestMapping("/update")
	public ModelAndView show10(@ModelAttribute("AppModel") AppModel appmodel)
	
	{
		
		obj.updatename(appmodel);
		ModelAndView model=new ModelAndView("index");
		return model;
		
		
	}
	@RequestMapping("/delete")
	public ModelAndView show11(@ModelAttribute("AppModel") AppModel appmodel)
	
	{
		
		obj.removename(appmodel);
		ModelAndView model=new ModelAndView("index");
		return model;
		
	}

}
