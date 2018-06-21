package com.ravi.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan("com.ravi")
public class SpringBootDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}
}
