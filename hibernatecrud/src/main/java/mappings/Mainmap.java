package mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Mainmap {
	public static void main(String[] args) {
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
		Student stu=new Student();
		stu.setSid(102);
		stu.setSname("vamsi");
		
		Address add=new Address();
		add.setAddressid(104);
		add.setAdressname("hyderabad");
		
		stu.setAddress(add);
		
		s.save(stu);
		
		tr.commit();
		System.out.println("one to one done.........");
		
		
		
		
		
		
		
	}

}
