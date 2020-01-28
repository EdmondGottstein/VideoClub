package com.edmond.VideoCLub.service;

import com.edmond.VideoCLub.model.videoclub.Customer;
import com.edmond.VideoCLub.model.videoclub.Employee;
import com.edmond.VideoCLub.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer findOne(Long id){
        return customerRepository.getOne(id);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer save(Customer customer){
        return customerRepository.saveAndFlush(customer);
    }

    public void delete(Long id) {
        Customer customer = customerRepository.getOne(id);
        customer.setDeleted(false);
        customerRepository.saveAndFlush(customer);
    }

}
