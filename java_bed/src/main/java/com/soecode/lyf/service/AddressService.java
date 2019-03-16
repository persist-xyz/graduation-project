package com.soecode.lyf.service;

import com.soecode.lyf.entity.Address;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface AddressService {

	/**
	 * 查询所有
	 *
	 * @return
	 */
	List<Address> queryAddressAll(long userid);


	/**
	 * 查询
	 * @return
	 */
//	Address getByName(String addressname, String addresspwd, String addresstype);

	/**
	 * 增加
	 * @return
	 */
	Integer addAddress(long userid, String receiver_address_username,String receiver_address_usertel,String receiver_address_useradr);

	/**
	 * 更新
	 * @return
	 */
	Integer updateAddress(long userid, long receiver_address_id, String receiver_address_username,String receiver_address_usertel,String receiver_address_useradr);

}
