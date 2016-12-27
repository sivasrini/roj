package com.rojbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Register {

		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private int roll;
		private String uname;
		private String username;
		private String password;
		private String address;
		
		
		private boolean enabled;


		public int getRoll() {
			return roll;
		}


		public void setRoll(int roll) {
			this.roll = roll;
		}


		

		public String getUname() {
			return uname;
		}


		public void setUname(String uname) {
			this.uname = uname;
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
			this.enabled = enabled;
		}


		
		


}
