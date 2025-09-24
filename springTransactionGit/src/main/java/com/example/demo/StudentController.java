package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentRepo repo;
	
	@PostMapping
	public String insert(@RequestBody Student data) {
		repo.save(data);
		return "student";
	}
	
	@GetMapping
	public Student get() {
		return (Student) repo.findAll();		
	}
}
