package com.org.CRMSystem.CRM_System.services.serviceImp;

import com.org.CRMSystem.CRM_System.entity.Employee;
import com.org.CRMSystem.CRM_System.entity.dto.EmployeeResponseDto;
import com.org.CRMSystem.CRM_System.repositirys.EmployeeRepository;
import com.org.CRMSystem.CRM_System.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public ResponseEntity<EmployeeResponseDto> GetEmployees() {
        var employee = employeeRepository.findAll();
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto("the request was successful",employee);
        return ResponseEntity.ok().body(employeeResponseDto);
    }
    public ResponseEntity<String> CreateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return ResponseEntity.ok("Employee created");
    }
    public ResponseEntity<String> UpdateEmployee(Employee employee) {
        Employee employeeDb = employeeRepository.findById(employee.getId()).orElseThrow();
        employeeDb.setName(employee.getName());
        employeeDb.setSurname(employee.getSurname());
        employeeDb.setAge(employee.getAge());
        employeeDb.setNumber(employee.getNumber());
        employeeDb.setSalary(employee.getSalary());
        employeeDb.setRole(employee.getRole());
        employeeRepository.save(employeeDb);
        return ResponseEntity.ok("Employee updated");
    }
    public ResponseEntity<String> DeleteEmployee(Long id) {
        employeeRepository.deleteById(id);
        return ResponseEntity.ok("Employee deleted");
    }
}
