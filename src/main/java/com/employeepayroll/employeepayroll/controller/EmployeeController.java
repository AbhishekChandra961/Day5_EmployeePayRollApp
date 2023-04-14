package com.employeepayroll.employeepayroll.controller;

import com.employeepayroll.employeepayroll.dto.EmployeeDTO;
import com.employeepayroll.employeepayroll.dto.ResponseDTO;
import com.employeepayroll.employeepayroll.model.EmployeeData;
import com.employeepayroll.employeepayroll.services.IEmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeServices iEmployeeServices;

    @PostMapping("/add")
    public EmployeeData addEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeData empData = iEmployeeServices.addEmployee(employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data Added Successfully",empData);
        return empData;
    }
}
