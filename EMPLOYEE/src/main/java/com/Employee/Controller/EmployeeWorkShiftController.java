package com.Employee.Controller;


import com.Employee.Models.EmployeeWorkShift;
import com.Employee.Service.EmployeeWorkShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee-work-shift")
public class EmployeeWorkShiftController {

    @Autowired
    private EmployeeWorkShiftService employeeWorkShiftService;

    @PostMapping
    public ResponseEntity<EmployeeWorkShift> createEmployeeWorkShift(@RequestBody EmployeeWorkShift employeeWorkShift) {
        EmployeeWorkShift createdWorkShift = employeeWorkShiftService.createEmployeeWorkShift(employeeWorkShift);
        return new ResponseEntity<>(createdWorkShift, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeWorkShift>> getAllEmployeeWorkShifts() {
        List<EmployeeWorkShift> workShifts = employeeWorkShiftService.getAllEmployeeWorkShifts();
        return new ResponseEntity<>(workShifts, HttpStatus.OK);
    }

    @GetMapping("/{workShiftId}")
    public ResponseEntity<EmployeeWorkShift> getEmployeeWorkShiftById(@PathVariable Long workShiftId) {
        return employeeWorkShiftService.getEmployeeWorkShiftById(workShiftId)
                .map(workShift -> new ResponseEntity<>(workShift, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{workShiftId}")
    public ResponseEntity<EmployeeWorkShift> updateEmployeeWorkShift(@PathVariable Long workShiftId, @RequestBody EmployeeWorkShift employeeWorkShift) {
        EmployeeWorkShift updatedWorkShift = employeeWorkShiftService.updateEmployeeWorkShift(workShiftId, employeeWorkShift);
        if (updatedWorkShift != null) {
            return new ResponseEntity<>(updatedWorkShift, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{workShiftId}")
    public ResponseEntity<Void> deleteEmployeeWorkShift(@PathVariable Long workShiftId) {
        employeeWorkShiftService.deleteEmployeeWorkShift(workShiftId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
