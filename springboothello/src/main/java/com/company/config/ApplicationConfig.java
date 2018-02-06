package com.company.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@ComponentScan(basePackages = "com.company.model")
@EnableMongoRepositories({ "com.company.repositories" })
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
	@Value("${spring.data.mongodb.username}")
	String userName;
	@Value("${spring.data.mongodb.database}")
	String database;
	@Value("${spring.data.mongodb.password}")
	String password;

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		// MongoCredential.createCredential(userName, database, password)
		MongoCredential mongoCredential = MongoCredential.createCredential(userName, database, password.toCharArray());
		ServerAddress address = new ServerAddress("localhost", 27017);
		MongoClient mongoClient = new MongoClient(address, Arrays.asList(mongoCredential));

		// MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, "apparao");
		return mongoTemplate;

	}

}