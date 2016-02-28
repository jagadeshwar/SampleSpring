package com.transactions.aop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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

		@RequestMapping("/addStudent")
		public ModelAndView addStudent(){
			
			return new ModelAndView("addStudent","student",student);
		}
	    
		@RequestMapping(value = "/registerStudent")
		public ModelAndView saveStudent(@ModelAttribute Student student){
			studentService.save(student);
			return new ModelAndView("addStudent","student",student);
		}
		
		@RequestMapping("/displayvalue")
		public ModelAndView displayValue(){
			String message = "Hello ";
			return new ModelAndView("hello","msg",message);
		}
		
		
	
	}
