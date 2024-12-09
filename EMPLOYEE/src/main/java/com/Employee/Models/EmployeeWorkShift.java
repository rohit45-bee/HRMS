package com.Employee.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_work_shift")
public class EmployeeWorkShift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_shift_id")
    private Long workShiftId;

    @Column(name = "emp_number", nullable = false)
    private Long empNumber;

    // Getters and Setters
    public Long getWorkShiftId() {
        return workShiftId;
    }

    public void setWorkShiftId(Long workShiftId) {
        this.workShiftId = workShiftId;
    }

    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }
}
