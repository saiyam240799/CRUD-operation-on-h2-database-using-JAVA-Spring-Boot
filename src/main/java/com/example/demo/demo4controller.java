package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
	
//	@RequestMapping("/getdata")
//	public ModelAndView getdetails(@RequestParam int id)
//	{
//		ModelAndView mv = new ModelAndView("getform.jsp");
//		
//		demoform4 demo = repo.findById(id).orElse(new demoform4());		
//		
//		
//		System.out.println(repo.findByName("saiyam"));
//	//	System.out.println(repo.findByNameSorted("saiyam"));
//		
//		mv.addObject(demo);
//		
//		return mv;		
//	}
//	
	
	
	
	
	@GetMapping("/details")
	public List<demoform4> getdetails()
	{
		return repo.findAll();
	}
	
	
	@DeleteMapping("/details/{id}")
	public String deletedetails(@PathVariable int id)
	{
		
		repo.deleteById(id);
		
		return "deleted";
	}
	

	@PutMapping(path = "/details" , consumes = "application/json")
	public demoform4 saveorupdatedetails(@RequestBody demoform4 demo)
	{
		repo.save(demo);
		return demo;
	}
	
	
	
	
	
	@PostMapping("/details")
	public demoform4 adddatapostman(@RequestBody demoform4 demo)
	{
		repo.save(demo);
		return demo;
	}
	
	
	
	
	@RequestMapping("/details/{id}")
	@ResponseBody
	public Optional<demoform4> getdetails(@PathVariable("id") int id)
	{
		return repo.findById(id);
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
