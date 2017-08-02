package com.invivoo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.invivoo.model.Customer;

//@Repository for data layer
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Bryan");
		customer.setLastname("Hansen");

		customers.add(customer);

		return customers;
	}
}
