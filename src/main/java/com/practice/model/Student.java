package com.practice.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository("student")
public class Student implements Serializable{
	private String s;//= "Hello";
	public Student() {
		System.out.println("Am student");
	}
	
	
	private String fname;

	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	
	
}
