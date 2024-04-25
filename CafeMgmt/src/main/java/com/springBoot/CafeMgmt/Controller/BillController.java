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

import com.springBoot.CafeMgmt.Entity.Bill;
import com.springBoot.CafeMgmt.Service.BillService;


@RestController
public class BillController {
	@Autowired
	BillService billService;
	
	
	@PostMapping("/bill")
	public Bill saveBill(@RequestBody Bill bill) {
		
		return billService.createBill(bill);
		
	}
	
	@GetMapping("/bill/{id}")
	public Bill getBillById(@PathVariable("id")int id) {
		
		return billService.getBillById(id);
	}
	
	@GetMapping("/bill/getAllData")
	public List<Bill> getAllBill(){
		List<Bill> bill = billService.getAllBill();
		return bill;
	}
	
	@PutMapping("/bill/update/{id}")
	public Bill updateEvent(@PathVariable("id")int id, @RequestBody Bill bill) {
		bill.setId(id);
		Bill updateBill = billService.updateBill(bill);
		return updateBill;
	}
	
	@DeleteMapping("/bill/delete/{id}")
	public void deleteBill(@PathVariable int id)
	{   
		billService.deleteBill(id);
		System.out.println("Data deleted successfully");
	}

}
