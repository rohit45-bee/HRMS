package com.Employee.Service;



import com.Employee.Models.EmployeeDependent;

import java.util.List;

public interface EmployeeDependentService {
    EmployeeDependent createEmployeeDependent(EmployeeDependent employeeDependent);
    EmployeeDependent getEmployeeDependentByEmpNumber(String empNumber);
    List<EmployeeDependent> getAllEmployeeDependents();
    EmployeeDependent updateEmployeeDependent(String empNumber, EmployeeDependent employeeDependent);
    void deleteEmployeeDependent(String empNumber);
}
