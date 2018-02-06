package csvtojsonexample.csvtojsonexample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//springebeanconfig.xml in src main resources
@Configuration
//@PropertySource("classpath:employee.properties")
@PropertySource(name="xy", 
value = {
        "classpath:employee.properties",
        "classpath:employee2.properties"       
})
public class SpringBeanConfig implements BeanNameAware,BeanClassLoaderAware,InitializingBean,DisposableBean{
	@Value("${id}")
	private String id;
	@Value("${name}")
	private String name;
	@Value("${salary}")
	private String salary;
	// <bean id="emp" class="pkg.EMployee">
	@Bean(name = "emp1")
	// method to create object
	public Employee cky () {
		return new Employee(id, name, salary);
	}
	@Bean(name = "emp2")
	// method to create object
	public Employee employee2() {
		return new Employee("201", "apparao", "60000");
	}
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println(beanName +" bean has been initialized." );
	}
	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		System.out.println("parent class loader:"+classLoader.getParent());
	}
	@PostConstruct
	public void mystartlogic(){
		System.out.println("  mystartlogic : " );
	}
	@PreDestroy
	public void myendlogic(){
		System.out.println("myendlogic.............");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" after properties are set : " );
	}
	public void destroy() throws Exception {
		System.out.println(" destroy : " );
		// TODO Auto-generated method stub
		
	}
}
