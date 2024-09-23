package com.org.CRMSystem.CRM_System.entity.dto;

import com.org.CRMSystem.CRM_System.entity.Employee;
import com.org.CRMSystem.CRM_System.entity.Product;
import lombok.Data;

import java.util.List;

@Data
public class ProductResponseDto {
    public ProductResponseDto(String message, List<Product> data) {
        this.message = message;
        this.data = data;
    }

    private String message;
    private List<Product> data;
}
