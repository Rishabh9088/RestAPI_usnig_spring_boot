package com.example.asset_management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asset_management.entities.Category;

public interface CategoryDao extends JpaRepository<Category, Long>{

}
