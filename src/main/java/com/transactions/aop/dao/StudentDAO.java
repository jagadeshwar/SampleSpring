package com.transactions.aop.dao;

import java.util.List;

import com.practice.model.Student;

public interface StudentDAO {
	
	public Integer save(Student student);
	public Student findById(Integer id);
	public List<Student> findAll();
	
}
