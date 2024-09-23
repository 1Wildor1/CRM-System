package com.org.CRMSystem.CRM_System.services;

import com.org.CRMSystem.CRM_System.entity.Employee;
import com.org.CRMSystem.CRM_System.entity.dto.EmployeeResponseDto;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {
    ResponseEntity<EmployeeResponseDto> GetEmployees();
    ResponseEntity<String> CreateEmployee(Employee employee);
    ResponseEntity<String> UpdateEmployee(Employee employee);
    ResponseEntity<String> DeleteEmployee(Long id);
}
