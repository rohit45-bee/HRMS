package com.Employee.Controller;


import com.Employee.Models.EmployeeEducation;
import com.Employee.Service.EmployeeEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee-educations")
public class EmployeeEducationController {

    @Autowired
    private EmployeeEducationService employeeEducationService;

    // Create or update employee education
    @PostMapping
    public ResponseEntity<EmployeeEducation> createOrUpdateEmployeeEducation(@RequestBody EmployeeEducation employeeEducation) {
        EmployeeEducation savedEducation = employeeEducationService.saveEmployeeEducation(employeeEducation);
        return ResponseEntity.ok(savedEducation);
    }

    // Get all educations by employee number
    @GetMapping("/by-empnumber/{empNumber}")
    public ResponseEntity<List<EmployeeEducation>> getEmployeeEducationsByEmpNumber(@PathVariable Long empNumber) {
        List<EmployeeEducation> educations = employeeEducationService.getEmployeeEducationsByEmpNumber(empNumber);
        return ResponseEntity.ok(educations);
    }

    // Update employee education by ID
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeEducation> updateEmployeeEducation(@PathVariable Long id, @RequestBody EmployeeEducation employeeEducation) {
        EmployeeEducation updatedEducation = employeeEducationService.updateEmployeeEducation(id, employeeEducation);
        if (updatedEducation != null) {
            return ResponseEntity.ok(updatedEducation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete employee education by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployeeEducation(@PathVariable Long id) {
        employeeEducationService.deleteEmployeeEducation(id);
        return ResponseEntity.noContent().build();
    }
}
