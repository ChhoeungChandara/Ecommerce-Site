package com.Ecommerce_site.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	
	@NotBlank
	@Size(min = 3, message = "Product name must contain atleast 3 characters")
	private String productName;
    private String image;
	@NotBlank
	@Size(min = 6, message = "Product description must contain atleast 6 characters")
	private String description;
	private Integer quantity;
	private double price;
	private double discount;
	private double specialPrice;

	
}
