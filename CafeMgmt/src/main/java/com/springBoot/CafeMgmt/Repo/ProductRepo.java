package com.springBoot.CafeMgmt.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.CafeMgmt.Entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product ,Integer>{

}
