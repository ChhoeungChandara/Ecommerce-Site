package com.Ecommerce_site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce_site.Entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Long> {

}
