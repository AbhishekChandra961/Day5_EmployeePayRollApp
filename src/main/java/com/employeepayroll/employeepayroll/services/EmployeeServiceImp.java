package com.employeepayroll.employeepayroll.services;

import com.employeepayroll.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.employeepayroll.model.EmployeeData;
import com.employeepayroll.employeepayroll.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements IEmployeeServices{
    @Autowired
    private EmployeeRepo emRepo;

    @Override
    public EmployeeData addEmployee(EmployeeDTO employeeDTO){
        EmployeeData empData = new EmployeeData(employeeDTO);
        return empData;
    }
}
