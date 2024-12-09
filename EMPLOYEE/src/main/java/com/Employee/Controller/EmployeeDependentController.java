package com.Employee.Controller;


import com.Employee.Models.EmployeeDependent;
import com.Employee.Service.EmployeeDependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-dependents")
public class EmployeeDependentController {

    @Autowired
    private EmployeeDependentService employeeDependentService;

    @PostMapping
    public ResponseEntity<EmployeeDependent> createEmployeeDependent(@RequestBody EmployeeDependent employeeDependent) {
        return ResponseEntity.ok(employeeDependentService.createEmployeeDependent(employeeDependent));
    }

    @GetMapping("/{empNumber}")
    public ResponseEntity<EmployeeDependent> getEmployeeDependentByEmpNumber(@PathVariable("empNumber") String empNumber) {
        return ResponseEntity.ok(employeeDependentService.getEmployeeDependentByEmpNumber(empNumber));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDependent>> getAllEmployeeDependents() {
        return ResponseEntity.ok(employeeDependentService.getAllEmployeeDependents());
    }

    @PutMapping("/{empNumber}")
    public ResponseEntity<EmployeeDependent> updateEmployeeDependent(@PathVariable("empNumber") String empNumber,
                                                                     @RequestBody EmployeeDependent employeeDependent) {
        return ResponseEntity.ok(employeeDependentService.updateEmployeeDependent(empNumber, employeeDependent));
    }

    @DeleteMapping("/{empNumber}")
    public ResponseEntity<Void> deleteEmployeeDependent(@PathVariable("empNumber") String empNumber) {
        employeeDependentService.deleteEmployeeDependent(empNumber);
        return ResponseEntity.noContent().build();
    }
}
