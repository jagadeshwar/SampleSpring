package com.transactions.aop.services;

import java.util.List;

import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.practice.model.Student;
import com.transactions.aop.dao.StudentDAO;

@Service("studentServic")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public int save(Student student) {
		System.out.println("Am Student Service "+student.getFirstname());
		return studentDAO.save(student);
	}

	@Override
	public int update(Student student) {
		
		return 0;
	}

	@Override
	public Student findById(Integer id) {
		
		return studentDAO.findById(id);
	}

	@Override
	public List<Student> findAll() {
		
		return studentDAO.findAll();
	}

}
