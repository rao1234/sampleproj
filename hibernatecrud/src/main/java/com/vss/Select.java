package com.vss;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Select {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		//Student stu = (Student) s.get(Student.class, new Integer(1000));
		// System.out.println(stu.getSid()+" "+stu.getSname());
		// stu.setSname("vamsi");
		// update Student set sname="vamsi" where sid=?
		// s.update(stu);
		// delete from student where sid=?
		//s.delete(stu);
		tx.commit();
		Criteria crt = s.createCriteria(Student.class);
		List l = crt.list();
		System.out.println(l);

	}
}
