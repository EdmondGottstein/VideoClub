package com.edmond.VideoCLub.repo;

import com.edmond.VideoCLub.model.videoclub.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
