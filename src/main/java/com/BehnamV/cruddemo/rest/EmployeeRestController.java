package com.BehnamV.cruddemo.rest;

import com.BehnamV.cruddemo.dao.EmployeeDAO;
import com.BehnamV.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDAO employeeDAO;
    //quick and dirt:inject employee dao
    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }
    // expose"/employees" and return a list of employees
    @GetMapping("employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }
}
