package boothello.SpringAutowiringexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringCfg.xml");  
        Student student=(Student) context.getBean("student");
        System.out.println(student);
        Address address=student.getAddress();
        System.out.println(address.getAddressid());
        System.out.println(address.getAddressname());

    }
}
