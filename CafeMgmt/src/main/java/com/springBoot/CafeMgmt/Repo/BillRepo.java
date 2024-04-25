package com.springBoot.CafeMgmt.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.CafeMgmt.Entity.Bill;

@Repository
public interface BillRepo extends JpaRepository<Bill ,Integer>{

}
