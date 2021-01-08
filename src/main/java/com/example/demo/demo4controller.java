package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demo4controller {

	@Autowired
	formrepo repo;
	
	
	@RequestMapping("/")
	public String form()
	{
		System.out.println("hello");
		return "form.jsp";
	}
	
	@RequestMapping("/adddata")
	public String adddata(demoform4 demo)
	{
		repo.save(demo);
		return "form.jsp";
	}
	
	@RequestMapping("/getdata")
	public ModelAndView getdetails(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("getform.jsp");
		
		demoform4 demo = repo.findById(id).orElse(new demoform4());		
		mv.addObject(demo);
		
		return mv;		
	}
	
	
	@RequestMapping("/deleterecord")
	public String deleterecord(@RequestParam int id)
	{
		repo.deleteById(id);
		return "form.jsp";
	}
	
	@RequestMapping("/updaterecord")
	public String updaterecord(@RequestParam int id,demoform4 demo)
	{
		
		
		repo.deleteById(id);
		repo.save(demo);
		
		return "form.jsp";
	}
	
	
	
}
