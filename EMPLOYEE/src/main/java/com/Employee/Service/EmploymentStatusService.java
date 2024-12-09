package com.Employee.Service;



import com.Employee.Models.EmploymentStatus;

import java.util.List;
import java.util.Optional;

public interface EmploymentStatusService {
    EmploymentStatus createEmploymentStatus(EmploymentStatus employmentStatus);
    EmploymentStatus updateEmploymentStatus(Long id, EmploymentStatus employmentStatus);
    void deleteEmploymentStatus(Long id);
    List<EmploymentStatus> getAllEmploymentStatuses();
    Optional<EmploymentStatus> getEmploymentStatusById(Long id);
}
