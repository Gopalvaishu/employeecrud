package service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.EmployeeDao;
import dto.Employee;
@Component
public class EmployeeService {
	

	@Autowired
	Employee employee;
	
	@Autowired
	EmployeeDao dao;
	
	public ModelAndView loademployee() {// modelandview is a class  take data 
		ModelAndView andView=new ModelAndView("InsertData.jsp");
		andView.addObject("employee",employee);
		return andView;
		
	}
	
	
	public ModelAndView saveemployee(@ModelAttribute Employee employee,@RequestParam String date)
	{
		employee.setDoj(Date.valueOf(date));
		
	     dao.save(employee);
		ModelAndView andView=new ModelAndView("Home.jsp");
		//andView.addObject("employee",employee);
		andView.addObject("msg","Data Added Successfully");
		
		return andView;
	}
	public ModelAndView fetch()
	{
		ModelAndView andView=new ModelAndView("Result.jsp");
		//List<Employee> list=dao.fetch();
		//if(list.isEmpty())
		//{
		//andView.addObject("msg","Data Not Found");
		//andView.setViewName("Home.jsp");
		//}
		//else
		//{
		//andView.addObject("list",list);
		//andView.addObject("Home.jsp");
		andView.addObject("list",dao.fetch());
		return andView;
		
	}


	public ModelAndView delete(int id) {
		ModelAndView andView=new ModelAndView("Result.jsp");
		dao.delete(id);
		andView.addObject("list",dao.fetch());
		andView.addObject("msg","Data Deleted Successfully");
		return andView;
	}


}
