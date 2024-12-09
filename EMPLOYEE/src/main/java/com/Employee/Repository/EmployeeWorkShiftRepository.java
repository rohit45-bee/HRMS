package com.Employee.Repository;


import com.Employee.Models.EmployeeWorkShift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeWorkShiftRepository extends JpaRepository<EmployeeWorkShift, Long> {
}
