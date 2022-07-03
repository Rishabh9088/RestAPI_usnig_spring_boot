package com.example.asset_management.services;

import java.util.List;

import com.example.asset_management.entities.Category;

public interface CategoryService {

		public List<Category> getCategories();
		
		public Category getCategory(long categoryId);
		
		public Category addCategory(Category category);
		
		public Category updateCategory(Category category);
		
		public void deleteCategory(long parseLong);
}
