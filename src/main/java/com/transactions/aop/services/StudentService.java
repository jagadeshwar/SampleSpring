package com.transactions.aop.services;

import java.util.List;

import com.practice.model.Student;

public interface StudentService {
	
	public int save(Student student);
	public int update(Student student);
	public Student findById(Integer id);
	public List<Student> findAll();
}
