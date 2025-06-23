package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.service.ServiceExample;

@SpringBootApplication
public class Example13062025Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Example13062025Application.class, args);
		ServiceExample bean = container.getBean(ServiceExample.class);
		bean.ServiceEmployedata();
	}

}
