package com.rojbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.rojbackend.DAO.AppDAOImple;
import com.rojbackend.DAO.AppDAOInter;
import com.rojbackend.DAO.RegisterDAOImple;
import com.rojbackend.DAO.RegisterDAOInter;
import com.rojbackend.model.AppModel;
import com.rojbackend.model.Register;
import com.rojbackend.model.makeyourdesign;


@Configuration
@EnableTransactionManagement

public class AppConfig {

	
	@Bean(name="datasource")
	public DataSource getH2DataSource()
	{
		
		BasicDataSource datasource=new BasicDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/test");
		datasource.setUsername("sa");
		datasource.setPassword("");
		
		return datasource;
	}
	
	
	@Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    sessionBuilder.addProperties(getHibernateProperties());
    sessionBuilder.addAnnotatedClasses(AppModel.class);
    sessionBuilder.addAnnotatedClasses(Register.class);
    sessionBuilder.addAnnotatedClasses(makeyourdesign.class);
   
      return sessionBuilder.buildSessionFactory();
    }

	
	public Properties getHibernateProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		return properties;
		
	}
	
	@Autowired
	@Bean(name="transactionmanager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		
		HibernateTransactionManager transactionmanager=new HibernateTransactionManager (sessionFactory);
		
		
		return transactionmanager;
		
		
	}
	
	//@Autowired
	@Bean(name="AppDAOImple")
	public AppDAOInter getAppDaoImple(SessionFactory sessionFactory)
	{
		System.out.println("i am appmodel");
		return new AppDAOImple();
	}
	
	//@Autowired
	@Bean(name="RegisterDAOImple")
	public RegisterDAOInter getRegisterDAOImple(SessionFactory sessionFactory)
	{
		
		System.out.println("i am register");
		return new RegisterDAOImple();
	}

	
	
	
	

}
