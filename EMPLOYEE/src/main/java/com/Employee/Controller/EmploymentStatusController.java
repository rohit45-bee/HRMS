package com.Employee.Controller;


import com.Employee.Models.EmploymentStatus;
import com.Employee.Service.EmploymentStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employment-status")
public class EmploymentStatusController {

    @Autowired
    private EmploymentStatusService employmentStatusService;

    @PostMapping
    public ResponseEntity<EmploymentStatus> createEmploymentStatus(@RequestBody EmploymentStatus employmentStatus) {
        EmploymentStatus createdStatus = employmentStatusService.createEmploymentStatus(employmentStatus);
        return new ResponseEntity<>(createdStatus, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmploymentStatus>> getAllEmploymentStatuses() {
        return new ResponseEntity<>(employmentStatusService.getAllEmploymentStatuses(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmploymentStatus> getEmploymentStatusById(@PathVariable Long id) {
        return employmentStatusService.getEmploymentStatusById(id)
                .map(status -> new ResponseEntity<>(status, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmploymentStatus> updateEmploymentStatus(@PathVariable Long id, @RequestBody EmploymentStatus employmentStatus) {
        EmploymentStatus updatedStatus = employmentStatusService.updateEmploymentStatus(id, employmentStatus);
        if (updatedStatus != null) {
            return new ResponseEntity<>(updatedStatus, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmploymentStatus(@PathVariable Long id) {
        employmentStatusService.deleteEmploymentStatus(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
