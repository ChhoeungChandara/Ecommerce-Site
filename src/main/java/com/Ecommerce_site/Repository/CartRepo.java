package com.Ecommerce_site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce_site.Entity.Cart;

public interface CartRepo extends JpaRepository<Cart,Long>{

}
