package com.jsp.school_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.school_management_system.dao.AddressDao;
import com.jsp.school_management_system.dto.Address;
@Service
public class AddressService {

	@Autowired
	AddressDao addressDao;
	
	public Address saveAddress(Address address) {
		return addressDao.saveAddress(address);
	}
	
	public Address fetchAddressById(int id) {
		return addressDao.fetchAddressById(id);
	}
	
	public Address updateAddress(int id,Address address) {
		return addressDao.updateAddressById(address, id);
	}
	
	public Address deleteAddress(int id) {
		return addressDao.deleteAddress(id);
	}
}
