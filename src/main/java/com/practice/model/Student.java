package com.practice.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public class Student implements Serializable{
	private String s = "Hello";
	public Student() {
		System.out.println("Am student");
	}
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
