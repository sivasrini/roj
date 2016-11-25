package com.repositoryofjewels.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.repositoryofjewels.DAO.ProductDAOImple;
import com.repositoryofjewels.DAO.ProductDAOInter;
import com.repositoryofjewels.model.Products;

@Controller
public class HomeController {
	@RequestMapping(value={"/","/index"})
	public String show()
	{
		return "index";
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
	@RequestMapping("/category")
	public String show3(Model model)
	{
		ProductDAOInter obj=new ProductDAOImple();
		//obj.getProduct();
		ArrayList<Products> al1=obj.getProduct();
		model.addAttribute("Product", al1);
		
		return "category";
	}
	

}