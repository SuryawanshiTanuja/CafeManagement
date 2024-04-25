package com.springBoot.CafeMgmt.Service;

import java.util.List;

import com.springBoot.CafeMgmt.Entity.Product;
import com.springBoot.CafeMgmt.Entity.User;

public interface ProductService 
{
	Product createProduct(Product product);
	Product getProductById(int id);
	
	List<Product> getAllProduct();
	Product updateProduct(Product product);
	void deleteProduct(int id);

}
