package com.Employee.Service;


import com.Employee.Models.EmploymentStatus;
import com.Employee.Repository.EmploymentStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmploymentStatusServiceImpl implements EmploymentStatusService {

    @Autowired
    private EmploymentStatusRepository employmentStatusRepository;

    @Override
    public EmploymentStatus createEmploymentStatus(EmploymentStatus employmentStatus) {
        return employmentStatusRepository.save(employmentStatus);
    }

    @Override
    public EmploymentStatus updateEmploymentStatus(Long id, EmploymentStatus employmentStatus) {
        Optional<EmploymentStatus> existingStatus = employmentStatusRepository.findById(id);
        if (existingStatus.isPresent()) {
            EmploymentStatus updatedStatus = existingStatus.get();
            updatedStatus.setName(employmentStatus.getName());
            return employmentStatusRepository.save(updatedStatus);
        } else {
            return null; // Handle not found case
        }
    }



    @Override
    public void deleteEmploymentStatus(Long id) {
        employmentStatusRepository.deleteById(id);
    }

    @Override
    public List<EmploymentStatus> getAllEmploymentStatuses() {
        return employmentStatusRepository.findAll();
    }

    @Override
    public Optional<EmploymentStatus> getEmploymentStatusById(Long id) {
        return employmentStatusRepository.findById(id);
    }
}
