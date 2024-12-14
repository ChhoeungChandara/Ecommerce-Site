package com.Ecommerce_site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce_site.Entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {
	Category findByCategoryName(String categoryName);
}
