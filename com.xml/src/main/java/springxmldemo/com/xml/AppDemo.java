package springxmldemo.com.xml;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppDemo 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(PatientConfig.class);
    	Patient patient= (Patient) applicationContext.getBean("patient");
    	System.out.println(patient.getPid());
    }
}
