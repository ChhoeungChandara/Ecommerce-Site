package com.Ecommerce_site.ResponseStatus;

import com.Ecommerce_site.DTO.UserDTO;
import lombok.Data;

@Data
public class JWTAuthResponse {
	private String token;
	private UserDTO user;
}