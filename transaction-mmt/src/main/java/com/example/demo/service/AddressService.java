package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address addAddress(Address address){
		Address addressSave = this.addressRepository.save(address);
		return addressSave;		
		
	}
}
