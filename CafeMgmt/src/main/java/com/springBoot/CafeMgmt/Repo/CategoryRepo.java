package com.springBoot.CafeMgmt.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.CafeMgmt.Entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category ,Integer>{

}
