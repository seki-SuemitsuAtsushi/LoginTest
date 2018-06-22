package com.suemitsu.spring.boot.logintestapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestViewController {

	@Autowired
	EmployeeRepository employeeRepo;
	
//	@RequestMapping("/testview")
//	public String index(Model model) {
//		
//		EmployeeEntity employee = employeeRepo.findByEmployeeName("user");
//		String name = employee.getPassword();
//		model.addAttribute("name", name);
//		return "testview";
//	}
	
//	@RequestMapping("/testview")
//	public ModelAndView testview(ModelAndView mv) {
//		EmployeeEntity employee = employeeRepo.findByEmployeeName("user");
//		String name = employee.getPassword();
//		mv.addObject("name", name);
//		mv.setViewName("testview");
//		return mv;
//	}
	
	@RequestMapping(value="/testview",method=RequestMethod.POST)
	public ModelAndView testview(@RequestParam("username") String name) {
		EmployeeEntity employee = employeeRepo.findByEmployeeName("user");
		name = employee.getPassword();
		ModelAndView mv = new ModelAndView("testview");
		mv.addObject("employee", employee);
		mv.setViewName("testview");
		return mv;

	}
	
}
