package com.org.CRMSystem.CRM_System.entity.dto;

import com.org.CRMSystem.CRM_System.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class EmployeeResponseDto {
    public EmployeeResponseDto(String message, List<Employee> data) {
        this.message = message;
        this.data = data;
    }

    private String message;
    private List<Employee> data; // Список сотрудников
}
