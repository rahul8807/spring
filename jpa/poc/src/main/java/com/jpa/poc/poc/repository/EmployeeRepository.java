package com.jpa.poc.poc.repository;

import com.jpa.poc.poc.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeRepository extends CrudRepository< Employee,Long > {

    public List<Employee> findByEmployeeName(String firstname);

}
