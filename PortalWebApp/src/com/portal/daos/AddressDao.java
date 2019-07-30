package com.portal.daos;

import com.portal.entities.Address;

public interface AddressDao {
	public boolean addAddress(Address ad);
	public boolean updateAddress(Address ad);
	public Address getAddressByEmployee(int empId);

}
