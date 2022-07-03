package com.example.asset_management.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.asset_management.entities.Category;
import com.example.asset_management.services.CategoryService;

@RestController
public class MyController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> getCategories()
	{
		return this.categoryService.getCategories();
	}
	
	@GetMapping("/categories/{categoryId}")
	public Category getCategory(@PathVariable String categoryId)
	
	{
		return this.categoryService.getCategory(Long.parseLong(categoryId));
	}
	
	@PostMapping("/categories")
	public Category addCategory(@RequestBody Category category) {
		return this.categoryService.addCategory(category);
	}
	
	@PutMapping("/categories")
	public Category updatecategory(@RequestBody Category category) {
		return this.categoryService.updateCategory(category);
	}
	
	@DeleteMapping("/categories/{categoryId}")
	public ResponseEntity<HttpStatus> deleteCategory(@PathVariable String categoryId){
		try {
			this.categoryService.deleteCategory(Long.parseLong(categoryId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
