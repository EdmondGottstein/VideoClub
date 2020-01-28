package com.edmond.VideoCLub.repo;

import com.edmond.VideoCLub.model.videoclub.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
