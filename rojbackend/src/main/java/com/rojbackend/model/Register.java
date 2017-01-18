package com.rojbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Register {

		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private String role;
		
	
		@Size(min=4,max=15, message="the name should be 4 characters")
		@NotNull
		private String name;
		
		@Size(min=2,max=10, message="the username should be a maximum of 10 characters")
		@NotNull
		private String username;
		
		@NotNull
		private String password;
		
		private String mobilenumber;
		
		
		private String emailid;
		
		
		@NotNull
		private String address;
		
		
		private boolean enabled;

		

		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = "USER_ROLE";
		}


		public String getName() {
			return name;
		}


		public String getMobilenumber() {
			return mobilenumber;
		}


		public void setMobilenumber(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}


		public String getEmailid() {
			return emailid;
		}


		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public boolean isEnabled() {
			return enabled;
		}


		public void setEnabled(boolean enabled) {
			this.enabled = true;
		}


		
		


}
