package com.EMS.repository;

import com.EMS.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, Integer> {
}



