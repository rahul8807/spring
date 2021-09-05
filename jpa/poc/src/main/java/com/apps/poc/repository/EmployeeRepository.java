package com.apps.poc.repository;

import com.apps.poc.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface EmployeeRepository extends CrudRepository< Employee,Long > {

    public List<Employee> findByEmployeeName(String firstname);

}
