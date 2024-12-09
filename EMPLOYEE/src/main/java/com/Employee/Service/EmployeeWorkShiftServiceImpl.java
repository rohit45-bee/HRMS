package com.Employee.Service;


import com.Employee.Models.EmployeeWorkShift;
import com.Employee.Repository.EmployeeWorkShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeWorkShiftServiceImpl implements EmployeeWorkShiftService {

    @Autowired
    private EmployeeWorkShiftRepository employeeWorkShiftRepository;

    @Override
    public EmployeeWorkShift createEmployeeWorkShift(EmployeeWorkShift employeeWorkShift) {
        return employeeWorkShiftRepository.save(employeeWorkShift);
    }

    @Override
    public EmployeeWorkShift updateEmployeeWorkShift(Long workShiftId, EmployeeWorkShift employeeWorkShift) {
        Optional<EmployeeWorkShift> existingWorkShift = employeeWorkShiftRepository.findById(workShiftId);
        if (existingWorkShift.isPresent()) {
            EmployeeWorkShift updatedWorkShift = existingWorkShift.get();
            updatedWorkShift.setEmpNumber(employeeWorkShift.getEmpNumber());
            return employeeWorkShiftRepository.save(updatedWorkShift);
        } else {
            return null; // Handle not found case
        }
    }


    @Override
    public void deleteEmployeeWorkShift(Long workShiftId) {
        employeeWorkShiftRepository.deleteById(workShiftId);
    }

    @Override
    public List<EmployeeWorkShift> getAllEmployeeWorkShifts() {
        return employeeWorkShiftRepository.findAll();
    }

    @Override
    public Optional<EmployeeWorkShift> getEmployeeWorkShiftById(Long workShiftId) {
        return employeeWorkShiftRepository.findById(workShiftId);
    }
}
