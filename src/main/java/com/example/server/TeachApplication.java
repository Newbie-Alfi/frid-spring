package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class TeachApplication {
	public static void main(String[] args) {
		SpringApplication.run(TeachApplication.class, args);
	}

//	@Bean
//	public ReloadableResourceBundleMessageSource messageSource() {
//		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//		messageSource.setBasename("classpath:messages");
//		messageSource.setCacheSeconds(3600);
//		messageSource.setDefaultEncoding("UTF-8");
//		return messageSource;
//	}
}

