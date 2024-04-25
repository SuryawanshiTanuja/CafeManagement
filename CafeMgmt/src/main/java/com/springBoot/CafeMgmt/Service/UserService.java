package com.springBoot.CafeMgmt.Service;

import java.util.List;

import com.springBoot.CafeMgmt.Entity.User;

public interface UserService {
	
	User createUser(User user);
	User getUserById(int id);
	
	List<User> getAllUser();
	User updateUser(User user);
	void deleteUser(int id);

}
