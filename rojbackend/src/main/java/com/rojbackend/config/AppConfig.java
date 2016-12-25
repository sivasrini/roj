package com.rojbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.rojbackend.DAO.AppDAOImple;
import com.rojbackend.DAO.RegisterDAOImple;


@Configuration

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
	
	
	@Bean(name="sessionFactory")
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		
		sessionFactory.setDataSource(getH2DataSource());
		sessionFactory.setHibernateProperties(getHibernateProperties());
		sessionFactory.setPackagesToScan("com.rojbackend.model");
		
		
		return sessionFactory;
	}

	
	public Properties getHibernateProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		return properties;
		
	}
	
	@Bean(name="transactionmanager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		
		HibernateTransactionManager transactionmanager=new HibernateTransactionManager (sessionFactory);
		
		
		return transactionmanager;
		
		
	}
	
	@Bean(name="AppDAOImple")
	public AppDAOImple getAppDaoImple(SessionFactory sessionFactory)
	{
		AppDAOImple dao=new AppDAOImple();
		
		return dao;
	}
	
	@Bean(name="RegisterDAOImple")
	public RegisterDAOImple getRegisterDAOImple(SessionFactory sessionFactory)
	{
		RegisterDAOImple dao=new RegisterDAOImple();
		
		return dao;
	}

	
	
	
	

}
