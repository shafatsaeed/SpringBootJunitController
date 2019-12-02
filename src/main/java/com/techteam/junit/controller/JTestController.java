package com.techteam.junit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techteam.junit.model.Employee;

@RestController
public class JTestController {

	@GetMapping("/msg1")
	public String getMessage() {
		return "Hello";
	}
	
	@GetMapping("/msg2")
	public ResponseEntity<Object> getMessage2() {
		Employee emp = new Employee("2", "shafat");
		return new ResponseEntity(emp, HttpStatus.OK);
	}
}
