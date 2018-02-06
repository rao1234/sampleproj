package springxmldemo.com.xml;

import javax.swing.plaf.synth.SynthSpinnerUI;

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
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("AppaRao.xml");
    	Patient patient=(Patient) applicationContext.getBean("patient");
    	//System.out.println(patient.getPid());
    }
}
