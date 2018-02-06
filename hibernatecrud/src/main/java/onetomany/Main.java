package onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
		Vendor ven=new Vendor();
		ven.setVid(10);
		ven.setVname("ravi");
		
		Customer cus =new Customer();
		cus.setCid(12);
		cus.setCadress("customer1");
		
		//cus.setVendor(ven);
		Customer customer=new Customer();
		customer.setCid(201);
		customer.setCadress("customer2");
		
		Set<Customer> customers=new HashSet<>();
		customers.add(cus);
		customers.add(customer);
		
		ven.setCustomers(customers);
		
		s.save(ven);
		tr.commit();
		
		
		
	}

}
