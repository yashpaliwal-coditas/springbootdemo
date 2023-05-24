package com.example.springbootdemo.controller;

import com.example.springbootdemo.Employee;
import com.example.springbootdemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
public class CrudController {

    private EmployeeService employeeService;
    public CrudController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.OK);
    }
}
