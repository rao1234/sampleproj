package com.vss;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projections;

public class Studentcriteriademo {
	public static void main(String[] args) {
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		Criteria c=s.createCriteria(Student.class);
		//List<Student>stu=c.list();
		//System.out.println(stu);
		
		c.setProjection(Projections.property("sid"));
		Integer Stude=(Integer) c.uniqueResult();
		System.out.println(Stude);
	}

}
