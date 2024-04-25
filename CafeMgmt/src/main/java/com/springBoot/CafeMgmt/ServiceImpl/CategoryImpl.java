package com.springBoot.CafeMgmt.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.CafeMgmt.Entity.Category;

import com.springBoot.CafeMgmt.Repo.CategoryRepo;
import com.springBoot.CafeMgmt.Service.CategoryService;

@Service
public class CategoryImpl implements CategoryService
{
	@Autowired 
	CategoryRepo categoryRepo;
	@Override
	public Category createCategory(Category category) {
		Category c1 =categoryRepo.save(category);
		return c1;
	}
    
	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		
		Category existingCategory = categoryRepo.findById(category.getId()).get();
		existingCategory.setName(category.getName());
		//existingCategory.setEventDescription(category.getEventDescription());
		
		Category updateCategory= categoryRepo.save(existingCategory);
		return updateCategory;
	}
	
	@Override
	public Category getCategoryById(int id) {
		Optional <Category> c1 = categoryRepo.findById(id);
		if(c1.isPresent()) 
		{
			return c1.get();
		}
		
		return null;
	}
	
	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		categoryRepo.deleteById(id);
		
	}


	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		
		return categoryRepo.findAll();
	}

	
	

}
