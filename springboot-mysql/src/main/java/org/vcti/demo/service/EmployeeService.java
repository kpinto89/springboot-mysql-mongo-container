package org.vcti.demo.service;

import org.vcti.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
        Employee saveEmployee(Employee employee);
        List<Employee> fetchEmployeeList();
        void deleteEmployeeById(Long employeeId);
}
