package com.code.ahmad.springBootCrudRestApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.ahmad.springBootCrudRestApi.Dao.EmployeeRespository;
import com.code.ahmad.springBootCrudRestApi.Entity.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	private EmployeeRespository repository;
	
	@Override
	public List<Employee> findAll() {
		// Calling repository to find all 
		return repository.findAll();
	}

	@Override
	public Employee findById(int id) {
		
		// Calling repository find by id
		Employee employee=null;		
		
		Optional <Employee> optionalResult= repository.findById(id);
		
		if(optionalResult.isPresent()) {
			employee=optionalResult.get();
		}

		return employee;
	}

	@Override
	public void save(Employee employee) {
		// Calling repository to save or update
		repository.save(employee);
	}

	@Override
	public void deleteById(int id) {
		// Calling repository to delelte by id
		repository.deleteById(id);	
	}


}
