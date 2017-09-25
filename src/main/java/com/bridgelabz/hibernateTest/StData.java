package com.bridgelabz.hibernateTest;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bridgeit.hibernateTest.ContractEmployee;
import com.bridgeit.hibernateTest.Employee;
import com.bridgeit.hibernateTest.RegularEmployee;

public class StData {

	public static void main(String[] args) {  
	      AnnotationConfiguration cfg=new AnnotationConfiguration();
			
		
		 Session session=cfg.configure("hibernate.cfg.xml")  
               .buildSessionFactory().openSession();  

		    Transaction tx=session.beginTransaction();  
		      
		    Employee e=new Employee();   
		    e.setName("Firoz");  
		      
		    RegularEmployee e1=new RegularEmployee();  
		 
		    e1.setName("sid");
		    e1.setSalary(50000);
		    e1.setBonus(5000);
		    
		    ContractEmployee e2=new ContractEmployee();
		    
		    e2.setName("Om");
		    e2.setPay_per_hour(100);
		    e2.setContract_duration("15 hours");
		      
		    session.persist(e);
		    session.persist(e1);  
		    session.persist(e2);  
		      
		    tx.commit();  
		    session.close();  
		    System.out.println("successfully saved");  
		}  
		}  


