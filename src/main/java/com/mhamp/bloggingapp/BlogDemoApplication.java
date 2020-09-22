package com.mhamp.bloggingapp;

import com.mhamp.bloggingapp.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class BlogDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogDemoApplication.class, args);
	}

}
