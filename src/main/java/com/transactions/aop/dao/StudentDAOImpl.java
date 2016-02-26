package com.transactions.aop.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.practice.model.Student;

public class StudentDAOImpl extends HibernateDaoSupport implements StudentDAO{

	HibernateTemplate hibernateTemplate = getHibernateTemplate();
	
	@Override
	public Integer save(Student student) {
		Integer id = (Integer) hibernateTemplate.save(student);
		return id;
	}

	@Override
	public Student findById(Integer id) {
		Student student = hibernateTemplate.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> findAll() {
		List<Student> studentList = hibernateTemplate.find("from Student");
		return studentList;
	}
	
	
}
