package com.sri.sboot.crud;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.sri.sboot.crud.repository")
@EntityScan("com.sri.sboot.crud.model")
public class CrudOperationsApplication implements CommandLineRunner{

	@Autowired
    DataSource dataSource;
	
	public static void main(String[] args) {
		System.out.println("1");
		SpringApplication.run(CrudOperationsApplication.class, args);
		System.out.println("2");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Our DataSource is = " + dataSource);
		
	}
}
