package com.company.demo.hibernatedemoevening;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //Get SessionFactory Interface from hibernate.cfg.xml
    	//hibernate in xml or annotation in our case it is annotation because i used entity table id column annotations in hjav class
    	SessionFactory sessionFactory=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	//from session factory create session inteeface which has predficed methids for inserting/updaring selecying and deleting
    	
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	//save prodcut data
    	
    	Product product=new Product();
    	product.setProdcutid(101);
    	product.setProdcutname("Apple Iphone");
    	
    	
    	
    	//call session.save method
    	
    	//session.save(product);
    	
    	//write select query you need to call session.get or session.load method by passing id
    	
    	Product productget=(Product) session.get(Product.class, new Integer(101));
    	System.out.println(productget.getProdcutid()+"....."+productget.getProdcutname());
    	Product productload=(Product) session.load(Product.class, new Integer(101));
    	System.out.println(productload.getProdcutid()+"....."+productload.getProdcutname());
    	
    	
    	//if you want to update data 
    	//first fetch the recortd using get or load method and them chaneg whate evr you want
    	Product updateproduct=(Product) session.load(Product.class, new Integer(101));
    	updateproduct.setProdcutname("Dell Laptop");
    	
//    	/session.update(updateproduct);
    	
    	
    	//for delete get the record first using get or load and call session.delete
    	Product deleteprodcut=(Product) session.get(Product.class, new Integer(101));
    	session.delete(deleteprodcut);
    	transaction.commit();
    	
    	session.close();
    	
    }
}
