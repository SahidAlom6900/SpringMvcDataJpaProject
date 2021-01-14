package org.springmvc.service;

import java.util.List;

import org.springmvc.entity.Customer;
import org.springmvc.exception.ResourceNotFoundException;

public interface CustomerService {

	public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId) throws ResourceNotFoundException;

    public void deleteCustomer(int theId) throws ResourceNotFoundException;
}
