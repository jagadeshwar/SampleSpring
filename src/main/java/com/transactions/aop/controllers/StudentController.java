package com.transactions.aop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.Student;
import com.transactions.aop.services.StudentService;


	@Controller
	public class StudentController {
	
		@Autowired
		private StudentService studentService;
		
		@Autowired
		private Student student;
	    
		/*public StudentService getStudentService() {
			return studentService;
		}

		public void setStudentService(StudentService studentService) {
			this.studentService = studentService;
		}
*/



		@RequestMapping("/addStuden")
		public ModelAndView addStudent(){
			
			return new ModelAndView("addStudent","student",student);
		}
	        
	
	}
