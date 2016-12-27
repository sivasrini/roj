package com.rojbackend.DAO;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.rojbackend.model.Register;

@Repository
@EnableTransactionManagement
public class RegisterDAOImple implements RegisterDAOInter
{

	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void adduser(Register r) {
		Session s=sessionFactory.openSession();
		s.save(r);
		
		System.out.println("add new user");
		s.flush();
		
	}


	@Transactional
	public void updateuser(Register r) {
		Session s=sessionFactory.openSession();
		s.update(r);
		s.flush();
		
	}

	@Transactional
	public Register selectuser(Register r) {
		
		Session s=sessionFactory.openSession();
	
		Criteria criteria= s.createCriteria(Register.class);
		criteria.add(Restrictions.eq("roll", 1));
		Register r1= (Register) criteria.uniqueResult();
		return r1;
		
	}
	
	
	
	
}
