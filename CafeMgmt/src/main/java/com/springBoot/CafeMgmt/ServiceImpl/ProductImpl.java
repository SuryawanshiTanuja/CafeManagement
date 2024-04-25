package com.springBoot.CafeMgmt.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.CafeMgmt.Entity.Product;
import com.springBoot.CafeMgmt.Repo.ProductRepo;
import com.springBoot.CafeMgmt.Service.ProductService;

@Service
public class ProductImpl implements ProductService
{
	@Autowired
	ProductRepo productRepo;
	@Override
	public Product createProduct(Product product) {
		Product p1 = productRepo.save(product);
		return p1;
	}
     
	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		
		Product existingProduct = productRepo.findById(product.getId()).get();
		existingProduct.setName(product.getName());
		existingProduct.setCategory(product.getCategory());
		existingProduct.setPrice(product.getPrice());
		
		Product updateProduct= productRepo.save(existingProduct);
		return updateProduct;
	}
	
	@Override
	public Product getProductById(int id) 
	{
		Optional <Product> p1 = productRepo.findById(id);
		if(p1.isPresent()) 
		{
			return p1.get();
		}
		
		return null;
	}
	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
		
	}


	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		
		return productRepo.findAll();
	}

	
	

}
