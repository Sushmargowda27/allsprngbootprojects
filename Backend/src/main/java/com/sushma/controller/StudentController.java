package com.sushma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sushma.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService studentservice;
	
	
}
