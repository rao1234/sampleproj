package spring.newspring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
		   public static void main(String[] args) {
		  
			ApplicationContext con = new ClassPathXmlApplicationContext("Spring Cfg.xml");
		      Hai obj = (Hai) con.getBean("Hai");
		      obj.getMessage();

}
}
