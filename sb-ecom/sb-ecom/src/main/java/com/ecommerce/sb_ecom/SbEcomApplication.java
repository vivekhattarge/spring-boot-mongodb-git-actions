package com.ecommerce.sb_ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(scanBasePackages={"com.*","com.ecommerce.repository"})
@CrossOrigin(origins = "*")
@ComponentScan({"com.*"})
@EnableMongoRepositories(basePackages = "com.*")
public class SbEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbEcomApplication.class, args);
	}

}
