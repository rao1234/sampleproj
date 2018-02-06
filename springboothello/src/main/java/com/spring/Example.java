package com.spring;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@SpringBootApplication
//@EnableSwagger2
@ComponentScan(basePackages={"com.company.controller","com.company.config"})
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello Wellcome";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
   /* @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()                 .apis(RequestHandlerSelectors.basePackage("com.company"))
                //.paths(regex("/product.*"))
                .build();
             
    }
*/
}