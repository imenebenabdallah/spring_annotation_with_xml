package com.invivoo.repository;

import java.util.List;

import com.invivoo.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}