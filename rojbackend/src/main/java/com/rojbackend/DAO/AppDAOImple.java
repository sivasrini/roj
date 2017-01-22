package com.rojbackend.DAO;

import java.util.ArrayList;
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
		s.flush();
		//s.close();
		
		
	}
	@Transactional
	public void updatename(AppModel n) {
		
		Session s=sessionFactory.openSession();
		s.update(n);
		System.out.println("the new updated value is"+n.getProductcategory());
		s.flush();
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void removename(AppModel n) {
		Session s=sessionFactory.openSession();
		s.delete(n);
		s.flush();
		// TODO Auto-generated method stub
		
	}
	
	
	@Transactional
	public AppModel getproductbyid(int id)
	{
		Session s=sessionFactory.openSession();
		//Criteria criteria=s.createCriteria(AppModel.class);
		//criteria.add(Restrictions.eq("id", id));
		AppModel n1= (AppModel)s.get(AppModel.class, id);
		System.out.println("sooooo cuuuute" +n1.getProductname());
		return n1;
    }
	
	@Transactional
	public List<AppModel> selectproduct(String selectproduct)
	{
		Session s=sessionFactory.openSession();
		
		Criteria criteria= s.createCriteria(AppModel.class);
		criteria.add(Restrictions.eq("productcategory", selectproduct));
		List<AppModel> crit= (List<AppModel>) criteria.list();
		return crit;
	}
	
	@Transactional
	public List<AppModel> listproducts(AppModel n)
	{
		
		Session s=sessionFactory.openSession();
		Criteria criteria= s.createCriteria(AppModel.class);
	    List<AppModel> crit= (List<AppModel>) criteria.list();
		return crit;
		
		
	}
	
	@Transactional
	public void addmyproduct(makeyourdesign m) {
		
		Session s=sessionFactory.openSession();
		s.save(m);
		System.out.println(m.getProductname());
		
	}
	

}
