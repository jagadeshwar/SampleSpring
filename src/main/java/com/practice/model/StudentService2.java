package com.practice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService2 {
	
	@Autowired
	Student student;
	
	public StudentService2(){
		System.out.println("Am StudentService2");
	}
	public void getData(){
		System.out.println("Hi am getData  in service2  "+student.hashCode());
	}
	
}
