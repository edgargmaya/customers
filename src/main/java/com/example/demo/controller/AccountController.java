package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class AccountController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/{id}")
	public Object getAccount( @PathVariable("id") String id ) {
		return customerService.getCustomer();
	}
	
}
