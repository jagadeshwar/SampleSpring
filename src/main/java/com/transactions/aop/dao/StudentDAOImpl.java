package com.transactions.aop.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.practice.model.Student;

@Repository("studentDAO")
//public class StudentDAOImpl extends HibernateDaoSupport implements StudentDAO{
public class StudentDAOImpl implements StudentDAO{
	
	
	@Override
	public Integer save(Student student) {
		Integer id = 0;//(Integer) hibernateTemplate.save(student);
		return id;
	}

	@Override
	public Student findById(Integer id) {
		Student student = null;//hibernateTemplate.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> findAll() {
		List<Student> studentList = null;//hibernateTemplate.find("from Student");
		return studentList;
	}
	
	
}
