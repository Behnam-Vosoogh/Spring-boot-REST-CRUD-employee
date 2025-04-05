package com.BehnamV.cruddemo.rest;

import com.BehnamV.cruddemo.dao.EmployeeDAO;
import com.BehnamV.cruddemo.entity.Employee;
import com.BehnamV.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    //quick and dirt:inject employee dao
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }
    // expose"/employees" and return a list of employees
    @GetMapping("employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
