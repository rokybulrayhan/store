package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService {
	@Autowired
	private EmployeeDao repo;
	
	public List<Employee> listAll(){
		return repo.findAll();
	}
	
	public void save(Employee employee) {
		repo.save(employee);	
	}
	
	public Employee get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
