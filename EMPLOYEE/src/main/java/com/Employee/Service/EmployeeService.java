package com.Employee.Service;



import com.Employee.Models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    String updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployeeById(Long id, Employee employee);
    String deleteEmployeeById(Long id);
}
