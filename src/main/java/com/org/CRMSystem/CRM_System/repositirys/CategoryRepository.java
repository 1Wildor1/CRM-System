package com.org.CRMSystem.CRM_System.repositirys;

import com.org.CRMSystem.CRM_System.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
   Optional<Category> findCategoryByTitle(String name);
}

