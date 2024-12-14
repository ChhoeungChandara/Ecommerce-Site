package com.Ecommerce_site.Service.Impl;

import org.springframework.stereotype.Service;

import com.Ecommerce_site.DTO.ProductDTO;
import com.Ecommerce_site.Entity.Product;
import com.Ecommerce_site.Repository.ProductRepo;
import com.Ecommerce_site.Service.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

	private final ProductRepo productRepo;


}
