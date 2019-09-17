package com.bank.account;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.bank.account.*" })
@EnableJpaRepositories
@EnableAutoConfiguration(exclude= {SecurityAutoConfiguration.class})
@Transactional
public class StartApplication extends SpringBootServletInitializer{  

	public static void main(String[] args) {
 		SpringApplication.run(StartApplication.class, args);
	}
	
}
