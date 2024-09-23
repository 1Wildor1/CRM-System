package com.org.CRMSystem.CRM_System.repositirys;

import com.org.CRMSystem.CRM_System.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
