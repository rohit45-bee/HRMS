package com.Employee.Repository;


import com.Employee.Models.EmployeeDependent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDependentRepository extends JpaRepository<EmployeeDependent, String> {
    // Additional query methods can be defined here
}
