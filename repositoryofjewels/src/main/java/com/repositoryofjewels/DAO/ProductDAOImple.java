package com.repositoryofjewels.DAO;

import java.util.ArrayList;

import com.repositoryofjewels.model.Products;

public class ProductDAOImple implements ProductDAOInter {
	
	ArrayList<Products> al= new ArrayList<Products>();
	

	public ArrayList<Products> getProduct() {
		setProduct();
		return al;
	}

	public void setProduct() {
		// TODO Auto-generated method stub
		Products p1=new Products("earrings",25000,"Gold");
		Products p2=new Products("Bangles",40000,"Gold");
		al.add(p1);
		al.add(p2);
	}
	
	
	

}
