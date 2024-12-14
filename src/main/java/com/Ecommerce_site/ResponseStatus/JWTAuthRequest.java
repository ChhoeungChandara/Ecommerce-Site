package com.Ecommerce_site.ResponseStatus;

import lombok.Data;

@Data
public class JWTAuthRequest {
	private String username;  // email
	private String password;
}