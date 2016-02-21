package SpringSamples.SampleSpring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.Contact;
import com.practice.model.Student;
import com.practice.model.StudentService;
import com.practice.model.StudentService2;

@Controller
@SessionAttributes
public class HomeController {
	
		
	@Autowired
	public StudentService studentService;
	
	
	@Autowired
	public StudentService2 studentService2;
	
	public HomeController() {
		System.out.println("Hi am home controller jjs");
	}
	
	@RequestMapping("/*")
    public ModelAndView showContacts() {
         
        return new ModelAndView("home", "contacts", new Contact());
    }
	
	
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public ModelAndView addContact(@ModelAttribute("contact") Contact contacts, BindingResult result) {
         
        System.out.println("First Name:" + contacts.getFirstname() + 
                    "Last Name:" + contacts.getLastname());
         
        
        return new ModelAndView("/hello","con",contacts);
    }
	
	/*@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		Student student = studentService.student;
		student.setFname("Jaggu ");
		student.setS("Hello");
		studentService.getData();
		studentService2.getData();
		return new ModelAndView("home");
	}*/
	
	
	@RequestMapping(value="/hai")
	public ModelAndView testing2(HttpServletResponse response,HttpServletRequest request) throws IOException{
		System.out.println("Hi am home controller2 ");//+student.getName());
		studentService.getData();
		studentService2.getData();
		request.getSession().invalidate();
		return new ModelAndView("home");
	}
	
}
