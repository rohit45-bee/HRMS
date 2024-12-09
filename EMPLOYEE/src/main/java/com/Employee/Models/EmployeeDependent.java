package com.Employee.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "emp_dependents")
public class EmployeeDependent {

    @Id
    @Column(name = "emp_number")
    private String empNumber;

    @Column(name = "ed_seqno")
    private Integer edSeqno;

    @Column(name = "ed_name")
    private String edName;

    @Column(name = "ed_relationship_type")
    private String edRelationshipType;

    @Column(name = "ed_relationship")
    private String edRelationship;

    @Column(name = "ed_date_of_birth")
    private LocalDate edDateOfBirth;

    // Getters and Setters
    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public Integer getEdSeqno() {
        return edSeqno;
    }

    public void setEdSeqno(Integer edSeqno) {
        this.edSeqno = edSeqno;
    }

    public String getEdName() {
        return edName;
    }

    public void setEdName(String edName) {
        this.edName = edName;
    }

    public String getEdRelationshipType() {
        return edRelationshipType;
    }

    public void setEdRelationshipType(String edRelationshipType) {
        this.edRelationshipType = edRelationshipType;
    }

    public String getEdRelationship() {
        return edRelationship;
    }

    public void setEdRelationship(String edRelationship) {
        this.edRelationship = edRelationship;
    }

    public LocalDate getEdDateOfBirth() {
        return edDateOfBirth;
    }

    public void setEdDateOfBirth(LocalDate edDateOfBirth) {
        this.edDateOfBirth = edDateOfBirth;
    }
}
