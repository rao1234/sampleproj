package boothello.SpringAutowiringexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:apparao.properties")
public class BeanConfigAnnotation {
	@Value("${studentid}")
	private String studentid;
	@Value("${studentname}")
	private String studentname;

	@Bean
	public Student student() {
		Student student = new Student();
		student.setStudentid(studentid);
		student.setStudentname(studentname);
		return student;
	}

	@Bean
	public Address address() {
		Address address = new Address();
		address.setAddressid("101");
		address.setAddressname("Btm");
		return address;
	}
}
