package com.BehnamV.cruddemo.rest;

import com.BehnamV.cruddemo.dao.EmployeeDAO;
import com.BehnamV.cruddemo.entity.Employee;
import com.BehnamV.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //find employee by id get expose "employees/{employeeId}"
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee = employeeService.findById(employeeId);
        if(theEmployee == null){
            throw  new RuntimeException("Employee id not found -"+employeeId);
        }
        return theEmployee;
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
        Employee dbEmployee =employeeService.save(theEmployee);
        return dbEmployee;
    }
    // add mapping for put /employees -updaete existing employee
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee =employeeService.save(theEmployee);
        return dbEmployee;
    }


}
