package injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
	      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

	     System.out.println(jc.getAddressList());
	      jc.getAddressSet();
	      jc.getAddressMap();
	      jc.getAddressProp();
	   }
	
		
	

}
