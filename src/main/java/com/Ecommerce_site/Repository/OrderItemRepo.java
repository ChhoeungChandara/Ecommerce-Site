package com.Ecommerce_site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce_site.Entity.Order;

public interface OrderItemRepo extends JpaRepository<Order,Long>{

}
