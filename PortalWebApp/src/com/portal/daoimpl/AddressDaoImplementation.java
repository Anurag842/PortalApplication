package com.portal.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.portal.daos.AddressDao;
import com.portal.entities.Address;
import com.portal.utilities.ConnectionCreator;

public class AddressDaoImplementation implements AddressDao {

	@Override
	public boolean addAddress(Address ad) {
		try
		(Connection conn = ConnectionCreator.getDBConnection();)
		{
			PreparedStatement ps=conn.prepareStatement("insert into addresstab values(?,?,?,?,?,?)");
			ps.setInt(1, ad.getEmployeeId());
			ps.setInt(2,ad.getHouseNo());
			ps.setString(3, ad.getLocality());
			ps.setString(4, ad.getCity());
			ps.setString(5, ad.getState());
			ps.setInt(6,ad.getPinCode());
			
			int i=ps.executeUpdate();
			if(i!=0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateAddress(Address ad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Address getAddressByEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
