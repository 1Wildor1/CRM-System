package com.org.CRMSystem.CRM_System.entity.dto;

import com.org.CRMSystem.CRM_System.entity.Category;
import com.org.CRMSystem.CRM_System.entity.Product;
import lombok.Data;

import java.util.List;

@Data
public class CategoryResponseDto {
    public CategoryResponseDto(String message, List<Category> data) {
        this.message = message;
        this.data = data;
    }

    private String message;
    private List<Category> data; // С
}
