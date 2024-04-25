package com.springBoot.CafeMgmt.Service;

import java.util.List;

import com.springBoot.CafeMgmt.Entity.Category;

public interface CategoryService
{
	Category createCategory(Category category);
	Category getCategoryById(int id);
	
	List<Category> getAllCategory();
	Category updateCategory(Category category);
	void deleteCategory(int id);
}
