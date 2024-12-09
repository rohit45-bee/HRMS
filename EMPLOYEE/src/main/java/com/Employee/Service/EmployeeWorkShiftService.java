package com.Employee.Service;


import com.Employee.Models.EmployeeWorkShift;

import java.util.List;
import java.util.Optional;

public interface EmployeeWorkShiftService {
    EmployeeWorkShift createEmployeeWorkShift(EmployeeWorkShift employeeWorkShift);
    EmployeeWorkShift updateEmployeeWorkShift(Long workShiftId, EmployeeWorkShift employeeWorkShift);
    void deleteEmployeeWorkShift(Long workShiftId);
    List<EmployeeWorkShift> getAllEmployeeWorkShifts();
    Optional<EmployeeWorkShift> getEmployeeWorkShiftById(Long workShiftId);
}
