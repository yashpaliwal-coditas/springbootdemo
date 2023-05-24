package com.example.springbootdemo.repository;

import com.example.springbootdemo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
