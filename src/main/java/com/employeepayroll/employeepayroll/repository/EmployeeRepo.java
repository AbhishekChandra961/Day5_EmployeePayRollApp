package com.employeepayroll.employeepayroll.repository;

import com.employeepayroll.employeepayroll.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeData,Integer> {
}
