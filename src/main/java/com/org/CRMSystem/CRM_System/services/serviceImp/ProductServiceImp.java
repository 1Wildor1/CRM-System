package com.org.CRMSystem.CRM_System.services.serviceImp;

import com.org.CRMSystem.CRM_System.entity.Category;
import com.org.CRMSystem.CRM_System.entity.Employee;
import com.org.CRMSystem.CRM_System.entity.Product;
import com.org.CRMSystem.CRM_System.entity.dto.CategoryResponseDto;
import com.org.CRMSystem.CRM_System.entity.dto.EmployeeResponseDto;
import com.org.CRMSystem.CRM_System.entity.dto.ProductResponseDto;
import com.org.CRMSystem.CRM_System.repositirys.CategoryRepository;
import com.org.CRMSystem.CRM_System.repositirys.ProductRepository;
import com.org.CRMSystem.CRM_System.response.AppResponse;
import com.org.CRMSystem.CRM_System.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;


    @Override
    public ResponseEntity<CategoryResponseDto> GetCategories() {
        var categoryList = categoryRepository.findAll();
        CategoryResponseDto employeeResponseDto = new CategoryResponseDto("the request was successful",categoryList);
        return ResponseEntity.ok().body(employeeResponseDto);
    }
    @Override
    public ResponseEntity<ProductResponseDto> GetProducts() {
        var productList = productRepository.findAll();
        ProductResponseDto productResponseDto = new ProductResponseDto("the request was successful",productList);
        return ResponseEntity.ok().body(productResponseDto);
    }

    @Override
    public ResponseEntity<String> CreateCategory(Category category) {
        categoryRepository.save(category);
        return ResponseEntity.ok("Category created");
    }

    @Override
    public ResponseEntity<String> CreateProduct(Product product) {
        productRepository.save(product);
        return ResponseEntity.ok("Product created");
    }

    @Override
    public ResponseEntity<String> UpdateProduct(Product product) {
        var productDb = productRepository.findById(product.getId()).orElseThrow();
        productDb.setName(product.getName());
        productDb.setPrice(product.getPrice());
        productDb.setQuantity(product.getQuantity());
        productDb.setCategory(product.getCategory());
        productRepository.save(productDb);
        return ResponseEntity.ok("Product updated");
    }

    @Override
    public ResponseEntity<String> DeleteProduct(Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok("Product deleted");
    }
}
