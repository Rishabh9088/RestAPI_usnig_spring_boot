package com.example.asset_management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.asset_management.dao.CategoryDao;
import com.example.asset_management.entities.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> getCategories() {
		
		return categoryDao.findAll();
	}

	@Override
	public Category getCategory(long categoryId) {
		return categoryDao.getOne(categoryId);
	}

	@Override
	public Category addCategory(Category category) {
		categoryDao.save(category);
		return category;
	}

	@Override
	public Category updateCategory(Category category) {
		categoryDao.save(category);
		return category;
	}

	@Override
	public void deleteCategory(long parseLong) {
		
		Category entity=categoryDao.getOne(parseLong);
		categoryDao.delete(entity);
	}

}
