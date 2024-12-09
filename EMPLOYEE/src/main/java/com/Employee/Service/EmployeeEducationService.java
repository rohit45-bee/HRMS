package com.Employee.Service;



import com.Employee.Models.EmployeeEducation;

import java.util.List;

public interface EmployeeEducationService {

    // Save or update employee education
    EmployeeEducation saveEmployeeEducation(EmployeeEducation employeeEducation);

    // Get all educations by employee number
    List<EmployeeEducation> getEmployeeEducationsByEmpNumber(Long empNumber);

    // Update employee education by ID
    EmployeeEducation updateEmployeeEducation(Long id, EmployeeEducation employeeEducation);

    // Delete employee education by ID
    void deleteEmployeeEducation(Long id);
}
