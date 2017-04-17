package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}
	
	/*@Bean
    public CommandLineRunner printAll(ApplicationContext ctx) {
        return args -> {
            System.out.println("Ariyady Kurniawan All beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            for (String beanName : beanNames)
                System.out.println(beanName);
        };
    }*/
	
	@Bean
    CommandLineRunner printMessage(HelloWorld component) {
        return args -> {
            component.setMessage("hello component");
            component.printMessage();
        };
    }
}
