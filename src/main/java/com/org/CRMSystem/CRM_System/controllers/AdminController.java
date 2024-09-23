package com.org.CRMSystem.CRM_System.controllers;

import com.org.CRMSystem.CRM_System.entity.Employee;
import com.org.CRMSystem.CRM_System.entity.dto.EmployeeResponseDto;
import com.org.CRMSystem.CRM_System.response.AppResponse;
import com.org.CRMSystem.CRM_System.response.DataResponse;
import com.org.CRMSystem.CRM_System.services.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private EmployeeService employeeService;

    @Operation(summary = "Получение всех сотрудников", description = "Возвращает список всех сотрудников.")
    @GetMapping("/employees")
    public ResponseEntity<DataResponse<EmployeeResponseDto>> GetEmployees() {
        var response = new DataResponse<>(HttpStatus.CREATED.value(),employeeService.GetEmployees());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @Operation(summary = "создание сотрудника", description = "Возвращает JSON с сообщением и статусом.")
    @PostMapping("/employees")
    public ResponseEntity<AppResponse> CreateEmployee(@RequestBody Employee employee) {
        var response = new AppResponse(HttpStatus.CREATED.value(),employeeService.CreateEmployee(employee));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @Operation(summary = "обновление сотрудника", description = "Возвращает JSON с сообщением и статусом.")
    @PutMapping("/employees")
    public ResponseEntity<AppResponse> UpdateEmployee(@RequestBody Employee employee) {
        var response = new AppResponse(HttpStatus.CREATED.value(),employeeService.UpdateEmployee(employee));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @Operation(summary = "удаление сотрудника", description = "Возвращает JSON с сообщением и статусом.")
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<AppResponse> DeleteEmployee(@RequestParam Long id) {
        var response = new AppResponse(HttpStatus.CREATED.value(),employeeService.DeleteEmployee(id));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
