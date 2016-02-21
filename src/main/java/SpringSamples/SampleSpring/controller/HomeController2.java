package SpringSamples.SampleSpring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.Student;

@Controller
public class HomeController2 {
	
	@Autowired
	Student student;
	
	public HomeController2() {
		System.out.println("Hi am home controller2 ");
	}
		
	@RequestMapping(value="/hello")
	public ModelAndView testing(HttpServletResponse response) throws IOException{
		System.out.println("Hi am home controller "+student.getName());
		return new ModelAndView("hello");
	}
	
	
}
