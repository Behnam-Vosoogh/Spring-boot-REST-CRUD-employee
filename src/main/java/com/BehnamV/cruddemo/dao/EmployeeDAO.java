package com.BehnamV.cruddemo.dao;

import com.BehnamV.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
