package com.vss;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ProductCriteriaDemo {
public static void main(String[] args) {
	SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	
	Criteria criteria=session.createCriteria(Product.class);
	//select * from product
	
	List<Product>products=criteria.list();
	System.out.println(products);
	//select * from product where pid=103
	
	//where clause is nothing but Restrictions
	criteria.add(Restrictions.eq("pid", 103));
	//select particular field set projection
	criteria.setProjection(Projections.property("pid"));
	Integer product=(Integer) criteria.uniqueResult();
	System.out.println(product);
	
	
}
}
