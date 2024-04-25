package com.springBoot.CafeMgmt.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.CafeMgmt.Entity.Bill;
import com.springBoot.CafeMgmt.Repo.BillRepo;
import com.springBoot.CafeMgmt.Service.BillService;


@Service
public class BillImpl implements BillService
{
	@Autowired
	BillRepo billRepo;
	@Override
	public Bill createBill(Bill bill) {
		Bill b1 = billRepo.save(bill);
		return b1;
	}
    
	@Override
	public Bill updateBill(Bill bill) {
		// TODO Auto-generated method stub
		
		Bill existingBill = billRepo.findById(bill.getId()).get();
	
		existingBill.setName(bill.getName());
		existingBill.setEmail(bill.getEmail());
		existingBill.setPhno(bill.getPhno());
		existingBill.setPaymentMethod(bill.getPaymentMethod());
		existingBill.setTotal(bill.getTotal());
		
		Bill updateBill= billRepo.save(existingBill);
		return updateBill;
	}
	
	@Override
	public Bill getBillById(int id) {
		Optional <Bill> b1 = billRepo.findById(id);
		if(b1.isPresent()) 
		{
			return b1.get();
		}
		
		return null;
	}
	@Override
	public void deleteBill(int id) {
		// TODO Auto-generated method stub
		billRepo.deleteById(id);
		
	}


	@Override
	public List<Bill> getAllBill() {
		// TODO Auto-generated method stub
		
		return billRepo.findAll();
	}

	
	

}
