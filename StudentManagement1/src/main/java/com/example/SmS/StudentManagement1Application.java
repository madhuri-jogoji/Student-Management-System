package com.example.SmS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SmS.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagement1Application.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	

	
}
