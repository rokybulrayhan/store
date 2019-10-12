package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;
	/*
	 * @RequestMapping("/") public String viewHomepage(Model model) { List<Employee>
	 * listStudents = employeeService.listAll();
	 * model.addAttribute("listStudents",listStudents); return "index.html"; }
	 */
	
	
	  @GetMapping("/users") 
	  public List<Employee> AllList(){
		  return employeeService.listAll(); 
	  }
	
	@PutMapping("/save")
	public void save(Employee employee) {
		employeeService.save(employee);	
	}
	
	

}
