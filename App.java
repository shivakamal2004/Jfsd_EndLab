package com.klu.S25HI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        try
        {
        	Configuration con=new Configuration();
        	con.configure();
        	
        	SessionFactory sf=con.buildSessionFactory();
        	Session s=sf.openSession();
        	Transaction t=s.beginTransaction();
        	
        	FulltimeEmployee ft1=new FulltimeEmployee();
        	ft1.setEno(101);
        	ft1.setEname("MSK");
        	ft1.setEsal(200000);
        	
        	
        	s.save(ft1);
        	
        	FulltimeEmployee ft2=new FulltimeEmployee();
        	ft2.setEno(102);
        	ft2.setEname("SHIVA");
        	ft2.setEsal(250000);
        	
        	
        	s.save(ft2);
        	
        	ParttimeEmployee pt1=new ParttimeEmployee();
        	pt1.setEno(201);
        	pt1.setEname("KAMAL");
        	pt1.setPayment(500000);
        	
        	s.save(pt1);
        	
        	ParttimeEmployee pt2=new ParttimeEmployee();
        	pt2.setEno(202);
        	pt2.setEname("SHIVAKAMAL");
        	pt2.setPayment(550000);
        	
        	s.save(pt2);
        	
        	t.commit();
        	
        }
        catch(Exception e)
        {
       	 
        }
        
    }
}
