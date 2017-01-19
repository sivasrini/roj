package com.rojbackend.DAO;

import java.util.List;

import com.rojbackend.model.AppModel;
import com.rojbackend.model.Register;
import com.rojbackend.model.makeyourdesign;


public interface AppDAOInter {
	
	public void addname(AppModel n);
	public void updatename(AppModel n);
	public void removename(AppModel n);
	public AppModel selectproduct(AppModel n);
	public void addmyproduct(makeyourdesign m);
}
