package com.repositoryofjewels.model;

public class Products {
	private String  pname;
	private double pprice;
	private String pcategory;
	
	public Products(String pname, double pprice, String pcategory) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pcategory = pcategory;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	
	
	
	

}
