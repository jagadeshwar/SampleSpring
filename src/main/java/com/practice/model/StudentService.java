package com.practice.model;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	public Student student;
	
	public StudentService(){
		System.out.println("Am StudentService");
	}
	public void getData(){
		System.out.println("Hi am getData in services  "+student.hashCode()+"  Name  "+student.getFname());
	}
	
	@PreDestroy
	public void destoy(){
		System.out.println("Am destroy");
	}
	
}
