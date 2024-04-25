package com.springBoot.CafeMgmt.Service;

import java.util.List;

import com.springBoot.CafeMgmt.Entity.Bill;

public interface BillService 
{
	Bill createBill(Bill bill);
	Bill getBillById(int id);

	List<Bill> getAllBill();
	Bill updateBill(Bill bill);
	void deleteBill(int id);
}
