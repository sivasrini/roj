package com.rojbackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rojbackend.DAO.AppDAOImple;
import com.rojbackend.DAO.RegisterDAOImple;
import com.rojbackend.model.AppModel;
import com.rojbackend.model.Register;



/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
  /*  public static void main( String[] args )
    {
    	//AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.rojbackend.config");
       // context.refresh();

    	System.out.println("before refresh");
    	
        System.out.println("after refresh");
       //AppDAOImple obj=(AppDAOImple) context.getBean("AppDAOImple");
       AppModel obj1=new AppModel();
       obj1.setId(33);
       obj1.setName("earring");
       obj.updatename(obj1);
       obj.addname(obj1);
      obj.removename(obj1);
       
       AppModel obj2=obj.selectproduct(obj1);
       System.out.println(obj2.getId());
       System.out.println(obj2.getName());*/
       
    	
    	/*RegisterDAOImple ob=(RegisterDAOImple) context.getBean("RegisterDAOImple");
    	Register ob1=new Register();
    	ob1.setRoll(1);
    	ob1.setName("shiva");
    	ob1.setUsername("siva@gmail.com");
    	ob1.setPassword("123");
    	ob1.setAddress("sldfhosdlfjju");
    	//ob.adduser(ob1);
    	Register ob2= ob.selectuser(ob1);
    	System.out.println(ob2.getRoll());
    	System.out.println(ob2.getAddress());
    	System.out.println(ob2.getName());
    	System.out.println(ob2.getUsername());*/
   
    	
       
     
       
    }

