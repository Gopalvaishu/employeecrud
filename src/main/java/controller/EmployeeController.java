package controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.EmployeeDao;
import dto.Employee;
import service.EmployeeService;

@Controller
public class EmployeeController {
	
	//only for get req ,component create obj and autowired go and get the obj
	@Autowired
	EmployeeService service;
	
	@RequestMapping("Loademployee")
	public ModelAndView loadEmployee() {// modelandview is a class  take data 
		
		return service.loademployee();
		
	}
	@PostMapping("saveemployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee,@RequestParam String date)
	{
		
		
		return service.saveemployee(employee,date);
	}
		
		@GetMapping("fetchall")
		public ModelAndView fetch()
		{
		return service.fetch();
		}
		
		@GetMapping("delete")
		public ModelAndView delete(@RequestParam int id)
		{
			return service.delete(id);
		}
		
	}


