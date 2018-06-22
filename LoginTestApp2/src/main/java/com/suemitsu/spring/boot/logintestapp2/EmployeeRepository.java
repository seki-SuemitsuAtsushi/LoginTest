package com.suemitsu.spring.boot.logintestapp2;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	public EmployeeEntity findByEmployeeName(String employee_name);
}
