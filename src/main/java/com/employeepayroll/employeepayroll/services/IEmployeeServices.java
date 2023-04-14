package com.employeepayroll.employeepayroll.services;

import com.employeepayroll.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.employeepayroll.model.EmployeeData;

public interface IEmployeeServices {
    EmployeeData addEmployee(EmployeeDTO employeeDTO);
}
