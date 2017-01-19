package com.rojbackend.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.rojbackend.model.AppModel;
import com.rojbackend.model.Register;
import com.rojbackend.model.makeyourdesign;


@Repository



public class AppDAOImple implements AppDAOInter

{
	@Autowired
	SessionFactory sessionFactory;
	
	
	
	
	@Transactional
	public void addname(AppModel n) {
		System.out.println("add name");
		Session s=sessionFactory.openSession();
		s.save(n);
		//s.flush();
		//s.close();
		
		
	}
	@Transactional
	public void updatename(AppModel n) {
		
		Session s=sessionFactory.openSession();
		s.update(n);
		//s.flush();
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void removename(AppModel n) {
		Session s=sessionFactory.openSession();
		s.delete(n);
		//s.flush();
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public AppModel selectproduct(AppModel n)
	{
		Session s=sessionFactory.openSession();
		
		Criteria criteria= s.createCriteria(AppModel.class);
		criteria.add(Restrictions.eq("id", 33));
		AppModel n1= (AppModel) criteria.uniqueResult();
		return n1;
	}
	public void addmyproduct(makeyourdesign m) {
		
		Session s=sessionFactory.openSession();
		s.save(m);
		System.out.println(m.getProductname());
		
	}
	

}
