package com.springDemo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.springDemo"})
@EntityScan("com.springDemo.model")
@EnableJpaRepositories("com.springDemo.dao")
public class ProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
