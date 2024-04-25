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
import com.springBoot.CafeMgmt.Entity.User;
import com.springBoot.CafeMgmt.Service.UserService;

@RestController
public class UserController
{
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		
		return userService.createUser(user);
		
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id")int id) {
		
		return userService.getUserById(id);
	}
	
	@GetMapping("/user/getAllData")
	public List<User> getAllUser(){
		List<User> user = userService.getAllUser();
		return user;
	}
	
	@PutMapping("/user/update/{id}")
	public User updateUser(@PathVariable("id")int id, @RequestBody User user) {
		user.setId(id);
		User updateUser = userService.updateUser(user);
		return updateUser;
	}
	
	@DeleteMapping("/user/delete/{id}")
	public void deleteUser(@PathVariable int id)
	{   
		userService.deleteUser(id);
		System.out.println("Data deleted successfully");
	}
	
}
