package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FileuploadDownloadApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("Before:::::::::::::::");
		SpringApplication.run(FileuploadDownloadApplication.class, args);
		System.out.println("After:::::::::::::::");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(FileuploadDownloadApplication.class);
	}
	
}
