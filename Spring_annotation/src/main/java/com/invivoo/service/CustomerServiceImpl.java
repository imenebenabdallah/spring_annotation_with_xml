package com.invivoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invivoo.model.Customer;
import com.invivoo.repository.CustomerRepository;


//@Service for the business layer
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	

	public CustomerServiceImpl() {
		System.out.println("Constructor");
	}


	//@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		
		this.customerRepository = customerRepository;
	}

	
// using setter injection	
//	//@Autowired
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		System.out.println("We are using setter injection");
//		this.customerRepository = customerRepository;
//	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
	


}
