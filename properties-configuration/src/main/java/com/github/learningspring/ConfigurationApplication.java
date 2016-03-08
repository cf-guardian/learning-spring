package com.github.learningspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ConfigurationApplication.class, args);
		MyBean myBean = (MyBean)ac.getBean("myBean");
		System.out.println(myBean.getHome());
	}
}
