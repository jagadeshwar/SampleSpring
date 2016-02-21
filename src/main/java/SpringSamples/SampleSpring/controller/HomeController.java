package SpringSamples.SampleSpring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.Student;

@Controller
public class HomeController {
	
	@Autowired
	Student student;
	
	public HomeController() {
		System.out.println("Hi am home controller jjs");
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		student.setName("Jaggu");
		//System.out.println("Hi am home controller "+student.getName());
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/hai")
	public ModelAndView testing2(HttpServletResponse response) throws IOException{
		System.out.println("Hi am home controller2 "+student.getName());
		return new ModelAndView("home");
	}
	
}
