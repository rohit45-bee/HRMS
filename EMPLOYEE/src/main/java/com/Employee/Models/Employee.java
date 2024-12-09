package com.Employee.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary Key

    @Column(length = 50, nullable = false)
    private String employeeId;

    @Column(length = 100)
    private String empLastname;

    @Column(length = 100)
    private String empFirstname;

    @Column(length = 100)
    private String empMiddleName;

    @Column(length = 100)
    private String empNickName;

    @Column
    private boolean empSmoker;  // Correct boolean field

    @Column(length = 13)
    private String ethnicRaceCode;

    @Column
    private LocalDate empBirthday;

    @Column
    private int nationCode;

    @Column
    private short empGender;

    @Column(length = 20)
    private String empMaritalStatus;

    @Column(length = 100)
    private String empSsnNum;

    @Column(length = 100)
    private String empSinNum;

    @Column(length = 100)
    private String empOtherId;

    @Column(length = 100)
    private String empDriLiceNum;

    @Column
    private LocalDate empDriLiceExpDate;

    @Column(length = 100)
    private String empMilitaryService;

    @Column
    private int empStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpLastname() {
        return empLastname;
    }

    public void setEmpLastname(String empLastname) {
        this.empLastname = empLastname;
    }

    public String getEmpFirstname() {
        return empFirstname;
    }

    public void setEmpFirstname(String empFirstname) {
        this.empFirstname = empFirstname;
    }

    public String getEmpMiddleName() {
        return empMiddleName;
    }

    public void setEmpMiddleName(String empMiddleName) {
        this.empMiddleName = empMiddleName;
    }

    public String getEmpNickName() {
        return empNickName;
    }

    public void setEmpNickName(String empNickName) {
        this.empNickName = empNickName;
    }

    public boolean isEmpSmoker() {
        return empSmoker;
    }

    public void setEmpSmoker(boolean empSmoker) {
        this.empSmoker = empSmoker;
    }

    public String getEthnicRaceCode() {
        return ethnicRaceCode;
    }

    public void setEthnicRaceCode(String ethnicRaceCode) {
        this.ethnicRaceCode = ethnicRaceCode;
    }

    public LocalDate getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(LocalDate empBirthday) {
        this.empBirthday = empBirthday;
    }

    public int getNationCode() {
        return nationCode;
    }

    public void setNationCode(int nationCode) {
        this.nationCode = nationCode;
    }

    public short getEmpGender() {
        return empGender;
    }

    public void setEmpGender(short empGender) {
        this.empGender = empGender;
    }

    public String getEmpMaritalStatus() {
        return empMaritalStatus;
    }

    public void setEmpMaritalStatus(String empMaritalStatus) {
        this.empMaritalStatus = empMaritalStatus;
    }

    public String getEmpSsnNum() {
        return empSsnNum;
    }

    public void setEmpSsnNum(String empSsnNum) {
        this.empSsnNum = empSsnNum;
    }

    public String getEmpSinNum() {
        return empSinNum;
    }

    public void setEmpSinNum(String empSinNum) {
        this.empSinNum = empSinNum;
    }

    public String getEmpOtherId() {
        return empOtherId;
    }

    public void setEmpOtherId(String empOtherId) {
        this.empOtherId = empOtherId;
    }

    public String getEmpDriLiceNum() {
        return empDriLiceNum;
    }

    public void setEmpDriLiceNum(String empDriLiceNum) {
        this.empDriLiceNum = empDriLiceNum;
    }

    public LocalDate getEmpDriLiceExpDate() {
        return empDriLiceExpDate;
    }

    public void setEmpDriLiceExpDate(LocalDate empDriLiceExpDate) {
        this.empDriLiceExpDate = empDriLiceExpDate;
    }

    public String getEmpMilitaryService() {
        return empMilitaryService;
    }

    public void setEmpMilitaryService(String empMilitaryService) {
        this.empMilitaryService = empMilitaryService;
    }

    public int getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(int empStatus) {
        this.empStatus = empStatus;
    }

    public int getJobTitleCode() {
        return jobTitleCode;
    }

    public void setJobTitleCode(int jobTitleCode) {
        this.jobTitleCode = jobTitleCode;
    }

    public int getEeoCatCode() {
        return eeoCatCode;
    }

    public void setEeoCatCode(int eeoCatCode) {
        this.eeoCatCode = eeoCatCode;
    }

    public int getWorkStation() {
        return workStation;
    }

    public void setWorkStation(int workStation) {
        this.workStation = workStation;
    }

    public String getEmpStreet1() {
        return empStreet1;
    }

    public void setEmpStreet1(String empStreet1) {
        this.empStreet1 = empStreet1;
    }

    public String getEmpStreet2() {
        return empStreet2;
    }

    public void setEmpStreet2(String empStreet2) {
        this.empStreet2 = empStreet2;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCounCode() {
        return counCode;
    }

    public void setCounCode(String counCode) {
        this.counCode = counCode;
    }

    public String getProvinCode() {
        return provinCode;
    }

    public void setProvinCode(String provinCode) {
        this.provinCode = provinCode;
    }

    public String getEmpZipcode() {
        return empZipcode;
    }

    public void setEmpZipcode(String empZipcode) {
        this.empZipcode = empZipcode;
    }

    public String getEmpHmTelephone() {
        return empHmTelephone;
    }

    public void setEmpHmTelephone(String empHmTelephone) {
        this.empHmTelephone = empHmTelephone;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    public String getEmpWorkTelephone() {
        return empWorkTelephone;
    }

    public void setEmpWorkTelephone(String empWorkTelephone) {
        this.empWorkTelephone = empWorkTelephone;
    }

    public String getEmpWorkEmail() {
        return empWorkEmail;
    }

    public void setEmpWorkEmail(String empWorkEmail) {
        this.empWorkEmail = empWorkEmail;
    }

    public String getSalGrdCode() {
        return salGrdCode;
    }

    public void setSalGrdCode(String salGrdCode) {
        this.salGrdCode = salGrdCode;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getEmpOthEmail() {
        return empOthEmail;
    }

    public void setEmpOthEmail(String empOthEmail) {
        this.empOthEmail = empOthEmail;
    }

    public int getTerminationId() {
        return terminationId;
    }

    public void setTerminationId(int terminationId) {
        this.terminationId = terminationId;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }

    public String getCustom4() {
        return custom4;
    }

    public void setCustom4(String custom4) {
        this.custom4 = custom4;
    }

    public String getCustom5() {
        return custom5;
    }

    public void setCustom5(String custom5) {
        this.custom5 = custom5;
    }

    public String getCustom6() {
        return custom6;
    }

    public void setCustom6(String custom6) {
        this.custom6 = custom6;
    }

    public String getCustom7() {
        return custom7;
    }

    public void setCustom7(String custom7) {
        this.custom7 = custom7;
    }

    public String getCustom8() {
        return custom8;
    }

    public void setCustom8(String custom8) {
        this.custom8 = custom8;
    }

    public String getCustom9() {
        return custom9;
    }

    public void setCustom9(String custom9) {
        this.custom9 = custom9;
    }

    public String getCustom10() {
        return custom10;
    }

    public void setCustom10(String custom10) {
        this.custom10 = custom10;
    }

    @Column
    private int jobTitleCode;

    @Column
    private int eeoCatCode;

    @Column
    private int workStation;

    @Column(length = 100)
    private String empStreet1;

    @Column(length = 100)
    private String empStreet2;

    @Column(length = 100)
    private String cityCode;

    @Column(length = 100)
    private String counCode;

    @Column(length = 100)
    private String provinCode;

    @Column(length = 20)
    private String empZipcode;

    @Column(length = 50)
    private String empHmTelephone;

    @Column(length = 50)
    private String empMobile;

    @Column(length = 50)
    private String empWorkTelephone;

    @Column(length = 50)
    private String empWorkEmail;

    @Column(length = 13)
    private String salGrdCode;

    @Column
    private LocalDate joinedDate;

    @Column(length = 50)
    private String empOthEmail;

    @Column
    private int terminationId;

    @Column(length = 250)
    private String custom1;

    @Column(length = 250)
    private String custom2;

    @Column(length = 250)
    private String custom3;

    @Column(length = 250)
    private String custom4;

    @Column(length = 250)
    private String custom5;

    @Column(length = 250)
    private String custom6;

    @Column(length = 250)
    private String custom7;

    @Column(length = 250)
    private String custom8;

    @Column(length = 250)
    private String custom9;

    @Column(length = 250)
    private String custom10;

    // Getter and Setter methods are generated by Lombok's @Data annotation
}
