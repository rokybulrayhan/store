package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class EmployeeControllerWR {
	@Autowired
	public EmployeeService employeeService;
	@RequestMapping("/")
	public String viewHomepage(Model model) {
		List<Employee> listStudents = employeeService.listAll();
		model.addAttribute("listStudents",listStudents);
		return "index.html";
	}
}
