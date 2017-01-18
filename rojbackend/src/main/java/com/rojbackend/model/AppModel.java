package com.rojbackend.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class AppModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Transient
	private MultipartFile FileDetails;
	
	private String productname;
	private String productcategory;
	private String price;
	
	
	public AppModel()
	{
		super();
	}
	
	
	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getProductcategory() {
		return productcategory;
	}


	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public MultipartFile getFileDetails() {
		return FileDetails;
	}


	public void setFileDetails(MultipartFile fileDetails) {
		FileDetails = fileDetails;
	}


	



	
	

}
