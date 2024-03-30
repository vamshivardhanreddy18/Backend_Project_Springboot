package com.jsp.school_management_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.school_management_system.dto.Address;
import com.jsp.school_management_system.repo.AddressRepo;

@Repository
public class AddressDao {

	@Autowired
	AddressRepo addressRepo;
	
	public Address saveAddress(Address address) {
		return addressRepo.save(address);
	}
	
	public Address fetchAddressById(int id) {
		return addressRepo.findById(id).get();
	}
	
	public Address deleteAddress(int id) {
		Address address=fetchAddressById(id);
		addressRepo.delete(address);
		return address;
	}
	
	public Address updateAddressById(Address address, int id) {
		address.setAddressId(id);
		return saveAddress(address);
	}
}
