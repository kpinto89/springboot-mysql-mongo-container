package org.vcti.demo.repository;

import org.springframework.stereotype.Repository;
import org.vcti.demo.entity.Employee;
import org.springframework.data.mongodb.repository.*;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {
}
