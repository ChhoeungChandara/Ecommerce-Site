package com.Ecommerce_site.Service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.Ecommerce_site.DTO.CategoryDTO;
import com.Ecommerce_site.Entity.Category;
import com.Ecommerce_site.Exception.APIException;
import com.Ecommerce_site.Repository.CategoryRepo;
import com.Ecommerce_site.Service.CategoryService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
@Transactional
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

	private final CategoryRepo categoryRepo;
	
	private final ModelMapper modelMapper;
	
	@Override
	public CategoryDTO createCategory(Category category) {
		Category savedCategory = categoryRepo.findByCategoryName(category.getCategoryName());
		if (savedCategory != null) {
			throw new APIException("Category with the name '" + category.getCategoryName() + "' already exists !!!");
		}
		savedCategory = categoryRepo.save(category);
		return modelMapper.map(savedCategory, CategoryDTO.class);
	}

}
