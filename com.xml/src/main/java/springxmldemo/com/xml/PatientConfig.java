package springxmldemo.com.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientConfig {
@Bean
public Patient patient(){
	return new Patient(101,"name","btm");
}
}
