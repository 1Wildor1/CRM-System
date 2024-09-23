package com.org.CRMSystem.CRM_System.repositirys;

import com.org.CRMSystem.CRM_System.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
