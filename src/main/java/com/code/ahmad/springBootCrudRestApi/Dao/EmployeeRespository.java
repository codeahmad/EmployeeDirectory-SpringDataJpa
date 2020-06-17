package com.code.ahmad.springBootCrudRestApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.ahmad.springBootCrudRestApi.Entity.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

}
