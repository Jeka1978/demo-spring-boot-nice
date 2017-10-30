package com.nice.demospring.controllers;

import com.nice.demospring.model.Employee;
import com.nice.demospring.model.EmpolyeeCustomDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmpolyeeCustomDao dao;

    @PostMapping("/save")
    public void saveEmployee(@RequestBody Employee employee) {
        dao.saveEmployee(employee);
    }
}







