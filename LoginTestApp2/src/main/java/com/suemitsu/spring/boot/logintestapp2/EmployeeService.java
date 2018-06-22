package com.suemitsu.spring.boot.logintestapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements UserDetailsService  {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public UserDetails loadUserByUsername(String employee_name) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		if(employee_name == null || "".equals(employee_name)) {
			throw new UsernameNotFoundException("Username is Empty");
		}
	    EmployeeEntity employee = employeeRepo.findByEmployeeName(employee_name);
	    if (employee == null) {
	      throw new UsernameNotFoundException("Employee not found for name: " + employee_name);
	    }
	    
		return employee;
	}

}
