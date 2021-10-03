package com.ems.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.system.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
