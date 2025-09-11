package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentRepo repo;
	
	@PostMapping("/insert")
	public String insert(@RequestBody Student data) {
		repo.save(data);
		return "success";
	}
	
	@GetMapping("/display")
	public Student get() {
		return (Student) repo.findAll();		
	}
}
