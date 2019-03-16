package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.AddressDao;
import com.soecode.lyf.entity.Address;
import com.soecode.lyf.service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private AddressDao addressDao;

	@Override
	public List<Address> queryAddressAll(long userid) {
		return addressDao.queryAddressAll(userid);
	}

	/*@Override
	public Address getByName(String addressname,String addresspwd,String addresstype) {
		return addressDao.queryByName(addressname,addresspwd,addresstype);
	}*/

	@Override
	public Integer addAddress(long userid, String receiver_address_username,String receiver_address_usertel,String receiver_address_useradr) {
		return addressDao.addAddress(userid,receiver_address_username,receiver_address_usertel,receiver_address_useradr);
	}

	@Override
	public Integer updateAddress(long userid, long receiver_address_id,String receiver_address_username,String receiver_address_usertel,String receiver_address_useradr) {
		return addressDao.updateAddress(userid,receiver_address_id,receiver_address_username,receiver_address_usertel, receiver_address_useradr);
	}

}
