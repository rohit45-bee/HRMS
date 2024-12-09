package com.Employee.Service;


import com.Employee.Models.Employee;
import com.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public String updateEmployee(Employee employee) {
        if (employeeRepository.existsById(employee.getId())) {
            employeeRepository.save(employee);
            return "Employee updated successfully";
        }
        return "Employee not found";
    }



    @Override
    public void deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
        } else {
            // Handle employee not found scenario if needed
        }
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployeeById(Long id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);  // Ensure the ID is not modified
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public String deleteEmployeeById(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "Employee deleted successfully";
        }
        return "Employee not found";
    }
}
