package com.sushma.studentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.sushma.studentsystem.StudentsystemApplication;

@SpringBootApplication
@ComponentScan(basePackages="com.sushma")
public class StudentsystemApplication {
	public static void main(String[] args) 
	{
		SpringApplication.run(StudentsystemApplication.class, args);
	}
}
