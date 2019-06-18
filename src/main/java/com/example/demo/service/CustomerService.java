package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;

@Service
public class CustomerService {
	
	private List<Customer> customers = new ArrayList<>();
	
	private CustomerService(){
		customers.add(new Customer("Arturo","Rojas","Beltran","arthur_valkirio@bbva.com","3214344213153431","5546321256"));
	}
	
	public Customer getCustomer() {
		return customers.get(0);
	}
	
}
