package com.Employee.Repository;


import com.Employee.Models.EmploymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmploymentStatusRepository extends JpaRepository<EmploymentStatus, Long> {
}
