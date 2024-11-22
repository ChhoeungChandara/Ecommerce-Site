package com.Ecommerce_site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce_site.Entity.CartItem;

public interface CartItemRepo extends JpaRepository<CartItem,Long>{

}
