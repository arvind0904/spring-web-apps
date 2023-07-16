package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Address;
import com.example.demo.model.User;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressService addressService;
	
	@Transactional
	public User addUser(User user) throws Exception{
		User userSave = this.userRepository.save(user);
		
		Address address = new Address();
		address.setId(201L);
		address.setAddress("Delhi");
		address.setUser(user);	
		this.addressService.addAddress(address);
		
		return userSave;
		
	}
	
}
