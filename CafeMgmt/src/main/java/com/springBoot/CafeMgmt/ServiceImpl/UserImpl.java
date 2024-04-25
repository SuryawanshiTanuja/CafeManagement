package com.springBoot.CafeMgmt.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.CafeMgmt.Entity.User;
import com.springBoot.CafeMgmt.Repo.UserRepo;
import com.springBoot.CafeMgmt.Service.UserService;

@Service
public class UserImpl implements UserService
{
	@Autowired
	UserRepo userRepo;
	@Override
	public User createUser(User user) {
		User u1 = userRepo.save(user);
		return u1;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		
		User existingUser = userRepo.findById(user.getId()).get();
		existingUser.setName(user.getName());
		existingUser.setPhno(user.getPhno());
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
		
		User updateUser= userRepo.save(existingUser);
		return updateUser;
	}
	
	@Override
	public User getUserById(int id) {
		Optional <User> u1 = userRepo.findById(id);
		if(u1.isPresent()) 
		{
			return u1.get();
		}
		return null;
	}
	
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
		
	}


	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		
		return userRepo.findAll();
	}

	
	

}
