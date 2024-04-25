package com.springBoot.CafeMgmt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springBoot.CafeMgmt.Entity.Category;
import com.springBoot.CafeMgmt.Service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	
	@PostMapping("/category")
	public Category saveCategory(@RequestBody Category category) {
		
		return categoryService.createCategory(category);
		
	}
	
	@GetMapping("/category/{id}")
	public Category getProductById(@PathVariable("id")int id) {
		
		return categoryService.getCategoryById(id);
	}
	
	@GetMapping("/category/getAllData")
	public List<Category> getAllCategory(){
		List<Category> category = categoryService.getAllCategory();
		return category;
	}
	
	@PutMapping("/category/update/{id}")
	public Category updateCategory(@PathVariable("id")int id, @RequestBody Category category) {
		category.setId(id);
		Category updateCategory = categoryService.updateCategory(category);
		return updateCategory;
	}
	
	@DeleteMapping("/category/delete/{id}")
	public void deleteCategory(@PathVariable int id)
	{   
		categoryService.deleteCategory(id);
		System.out.println("Data deleted successfully");
	}
}
