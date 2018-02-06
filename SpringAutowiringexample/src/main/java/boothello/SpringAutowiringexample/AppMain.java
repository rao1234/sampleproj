package boothello.SpringAutowiringexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfigAnnotation.class);
	Student student=context.getBean(Student.class);
	System.out.println(student);
}
}
