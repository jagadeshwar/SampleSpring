package SpringSamples.SampleSpring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.Employee;
import com.practice.model.Student;
import com.practice.model.StudentService;
import com.practice.model.StudentService2;

@Controller
@SessionAttributes("student")
public class HomeController2 {
	
	/*@Autowired
	Student student;*/
	
	@Autowired
	public StudentService studentService;
	
	@Autowired
	public StudentService2 studentService2;
	
	public HomeController2() {
		System.out.println("Hi am home controller2 ");
	}
		
	@RequestMapping(value="/employee")
	public ModelAndView testing(@ModelAttribute Employee employee) throws IOException{
		System.out.println("Hi am home controller "+employee.getFname());//+student.getName());
		studentService.getData();
		studentService2.getData();
		return new ModelAndView("hello");
	}
	
	
}
