package com.edmond.VideoCLub.service;

import com.edmond.VideoCLub.model.videoclub.Customer;
import com.edmond.VideoCLub.model.videoclub.Employee;
import com.edmond.VideoCLub.repo.CustomerRepository;
import com.edmond.VideoCLub.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee findOne(Long id){
        return employeeRepository.getOne(id);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee){
        return employeeRepository.saveAndFlush(employee);
    }

    public void delete(Long id) {
        Employee employee = employeeRepository.getOne(id);
        employee.setDeleted(false);
        employeeRepository.saveAndFlush(employee);
    }
}
