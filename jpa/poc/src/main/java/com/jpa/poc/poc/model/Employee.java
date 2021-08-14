package com.jpa.poc.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_age")
    private Integer employeeAge;

    public Integer getEmployeeId () {
        return employeeId;
    }

    public void setEmployeeId ( Integer employeeId ) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName () {
        return employeeName;
    }

    public void setEmployeeName ( String employeeName ) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeAge () {
        return employeeAge;
    }

    public void setEmployeeAge ( Integer employeeAge ) {
        this.employeeAge = employeeAge;
    }
}
