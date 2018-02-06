package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {
	public static void main(String[] args) {
		/*
		 * how to call spring-beans.xml 1.ApplicationContext 2.BeanFactory
		 * 1.resource interface reads beans file
		 * 
		 */

		/*XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
		Student student = (Student) factory.getBean("st");
		student.setSname("srinadh");
		//student.getsname();
		
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext();
		Student stu =(Student)context.getBean("st");
		stu.getsname();

	}

}
