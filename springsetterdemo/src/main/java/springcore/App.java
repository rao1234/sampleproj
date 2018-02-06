package springcore;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // ApplicationContext context = new ClassPathXmlApplicationContext();
    	
    //  Product pr = (Product)  context.getBean("product");
    //  pr.getpid();
    	XmlBeanFactory fac = new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
    	Product pr = (Product)  fac.getBean("product");
         System.out.println(pr.getPid()+""+pr.getPname());
        
    }
}
