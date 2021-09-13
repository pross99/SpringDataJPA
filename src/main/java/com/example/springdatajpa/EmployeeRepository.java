package com.example.springdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee>findEmployeeByFristNameContaining(String str);
}
