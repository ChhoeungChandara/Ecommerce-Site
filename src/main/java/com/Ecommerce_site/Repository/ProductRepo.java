package com.Ecommerce_site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce_site.Entity.Product;

public interface ProductRepo extends JpaRepository<Product,Long>{

}
