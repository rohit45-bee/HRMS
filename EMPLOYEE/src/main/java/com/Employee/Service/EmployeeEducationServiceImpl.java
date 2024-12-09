package com.Employee.Service;


import com.Employee.Models.EmployeeEducation;
import com.Employee.Repository.EmployeeEducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeEducationServiceImpl implements EmployeeEducationService {

    @Autowired
    private EmployeeEducationRepository employeeEducationRepository;

    @Override
    public EmployeeEducation saveEmployeeEducation(EmployeeEducation employeeEducation) {
        return employeeEducationRepository.save(employeeEducation);
    }



    @Override
    public List<EmployeeEducation> getEmployeeEducationsByEmpNumber(Long empNumber) {
        return employeeEducationRepository.findByEmpNumber(empNumber);
    }

    @Override
    public EmployeeEducation updateEmployeeEducation(Long id, EmployeeEducation employeeEducation) {
        if (employeeEducationRepository.existsById(id)) {
            employeeEducation.setId(id);
            return employeeEducationRepository.save(employeeEducation);
        }
        return null;
    }

    @Override
    public void deleteEmployeeEducation(Long id) {
        if (employeeEducationRepository.existsById(id)) {
            employeeEducationRepository.deleteById(id);
        }
    }
}
