package csvtojsonexample.csvtojsonexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringAppMain {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
		
		//get object1 from applicationContext 
		Employee employee1=(Employee) applicationContext.getBean("emp1");
		Employee employee2=(Employee) applicationContext.getBean("emp2");
		System.out.println(employee1);
		System.out.println(employee2);
		applicationContext.close();
	}
}

