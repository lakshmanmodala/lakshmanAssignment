package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.service.IService;

@SpringBootApplication
public class SpringBootBeanInjectionCoreApplication implements CommandLineRunner{

	@Autowired
	public IService ser;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBeanInjectionCoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    System.out.println(ser.viewName());
		
	}

}
