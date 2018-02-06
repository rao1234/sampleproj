package com.vss;

import java.io.Serializable;
import java.text.Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Productinsert {
public static void main(String[] args) {
	Configuration cfg=new AnnotationConfiguration().configure();
	SessionFactory sfa=cfg.buildSessionFactory();
	Session s=sfa.openSession();
	Transaction tr=s.beginTransaction();
	Product p=new Product();
	p.setPid(103);
	p.setPname("santoor");
	//Serializable in=s.save(p);
	s.persist(p);
//	System.out.println(in);
	tr.commit();
	s.close();
	
}
}
