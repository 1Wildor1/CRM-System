package com.org.CRMSystem.CRM_System.controllers;

import com.org.CRMSystem.CRM_System.entity.Category;
import com.org.CRMSystem.CRM_System.entity.Product;
import com.org.CRMSystem.CRM_System.entity.dto.CategoryResponseDto;
import com.org.CRMSystem.CRM_System.entity.dto.ProductResponseDto;
import com.org.CRMSystem.CRM_System.repositirys.CategoryRepository;
import com.org.CRMSystem.CRM_System.repositirys.ProductRepository;
import com.org.CRMSystem.CRM_System.response.AppResponse;
import com.org.CRMSystem.CRM_System.response.DataResponse;
import com.org.CRMSystem.CRM_System.services.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {


    private ProductService productService;

    @Operation(summary = "получени категорий", description = "Возвращает список всех категорий.")
    @GetMapping("/category")
    public ResponseEntity<DataResponse<CategoryResponseDto>> getCategory(){
        var response = new DataResponse<>(HttpStatus.CREATED.value(),productService.GetCategories());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Operation(summary = "создание категории", description = "Возвращает список всех сотрудников.")
    @PostMapping("/category")
    public ResponseEntity<AppResponse> createCategory(@RequestBody Category category){
        var response = new AppResponse(HttpStatus.CREATED.value(),productService.CreateCategory(category));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @PostMapping("/product")
    public ResponseEntity<AppResponse> createProduct(@RequestBody Product product){
        var response = new AppResponse(HttpStatus.CREATED.value(),productService.CreateProduct(product));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

//    @PostMapping("/product/{title}")
//    public void getProductByCategory(@RequestParam String title){
//        var findCategory = categoryRepository.findCategoryByTitle(title);
//
//    }
}
