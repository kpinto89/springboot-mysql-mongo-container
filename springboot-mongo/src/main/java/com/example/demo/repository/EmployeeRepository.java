package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entity.Employee;
import org.springframework.data.mongodb.repository.*;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {
}
