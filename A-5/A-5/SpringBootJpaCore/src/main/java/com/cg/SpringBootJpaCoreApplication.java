package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

@SpringBootApplication
public class SpringBootJpaCoreApplication implements CommandLineRunner{

	@Autowired
	private IEmpDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaCoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Emp> lst=dao.viewEmp();
		lst.forEach(System.out::println);
	}

}
