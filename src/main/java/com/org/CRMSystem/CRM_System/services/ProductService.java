package com.org.CRMSystem.CRM_System.services;

import com.org.CRMSystem.CRM_System.entity.Category;
import com.org.CRMSystem.CRM_System.entity.Product;
import com.org.CRMSystem.CRM_System.entity.dto.CategoryResponseDto;
import com.org.CRMSystem.CRM_System.entity.dto.ProductResponseDto;
import com.org.CRMSystem.CRM_System.response.AppResponse;
import org.springframework.http.ResponseEntity;

public interface ProductService {


    ResponseEntity<ProductResponseDto> GetProducts();
    ResponseEntity<String> CreateCategory(Category category);
    ResponseEntity<CategoryResponseDto> GetCategories();

    ResponseEntity<String> CreateProduct(Product employee);

    ResponseEntity<String> UpdateProduct(Product employee);

    ResponseEntity<String> DeleteProduct(Long id);
}
