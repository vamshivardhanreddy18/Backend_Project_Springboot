package com.jsp.school_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.school_management_system.dto.Address;
import com.jsp.school_management_system.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/saveAddress")
	public Address saveAddress(@RequestBody Address address) {
		return addressService.saveAddress(address);
	}
	
	@GetMapping("/fetchAddressById")
	public Address fetchAddressById(int id) {
		return addressService.fetchAddressById(id);
	}
	
	@DeleteMapping("/deleteAddressById")
	public Address deleteAddressById(int id) {
		return addressService.deleteAddress(id);
	}
	
	@PutMapping("/updateAddress")
	public Address updateAddress(int id,@RequestBody Address address) {
		return addressService.updateAddress(id, address);
	}
	
}
