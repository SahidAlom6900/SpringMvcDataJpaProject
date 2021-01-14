package org.springmvc.repository;

import org.springframework.stereotype.Repository;
import org.springmvc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
