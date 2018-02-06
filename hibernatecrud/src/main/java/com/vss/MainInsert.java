package com.vss;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainInsert {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sfac = cfg.buildSessionFactory();
		Session session = sfac.openSession();
		Transaction tx = session.beginTransaction();
		Date now = new Date();

        DateAndTime date = new DateAndTime();
        date.setDate(now);
        date.setTime(now);
        date.setDateTime(now);

        session.save(date);
		tx.commit();
		session.close();
	}

}
