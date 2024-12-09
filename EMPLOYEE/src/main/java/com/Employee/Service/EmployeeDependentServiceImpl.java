package com.Employee.Service;


import com.Employee.Models.EmployeeDependent;
import com.Employee.Repository.EmployeeDependentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDependentServiceImpl implements EmployeeDependentService {

    @Autowired
    private EmployeeDependentRepository employeeDependentRepository;

    @Override
    public EmployeeDependent createEmployeeDependent(EmployeeDependent employeeDependent) {
        return employeeDependentRepository.save(employeeDependent);
    }



    @Override
    public EmployeeDependent getEmployeeDependentByEmpNumber(String empNumber) {
        return employeeDependentRepository.findById(empNumber)
                .orElseThrow(() -> new RuntimeException("EmployeeDependent not found with empNumber " + empNumber));
    }

    @Override
    public List<EmployeeDependent> getAllEmployeeDependents() {
        return employeeDependentRepository.findAll();
    }

    @Override
    public EmployeeDependent updateEmployeeDependent(String empNumber, EmployeeDependent employeeDependent) {
        if (employeeDependentRepository.existsById(empNumber)) {
            employeeDependent.setEmpNumber(empNumber);
            return employeeDependentRepository.save(employeeDependent);
        } else {
            throw new RuntimeException("EmployeeDependent not found with empNumber " + empNumber);
        }
    }

    @Override
    public void deleteEmployeeDependent(String empNumber) {
        employeeDependentRepository.deleteById(empNumber);
    }
}
