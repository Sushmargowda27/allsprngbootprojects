package com.sushma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studrepo;

	
}
