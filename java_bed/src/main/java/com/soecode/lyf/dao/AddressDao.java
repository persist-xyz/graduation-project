package com.soecode.lyf.dao;

import com.soecode.lyf.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressDao {

	/**
	 * 查询所有
	 * @param userid
	 * @return
	 */
	List<Address> queryAddressAll(@Param("userid") long userid);

	/**
	 * @param
	 * @return
	 */
//	Address queryByName(@Param("addressname") String addressname, @Param("addresspwd") String addresspwd, @Param("addresstype") String addresstype);


	/**
	 * @param userid
	 * @return
	 */
	Integer addAddress(@Param("userid") long userid, @Param("receiver_address_username") String receiver_address_username,
					   @Param("receiver_address_usertel") String receiver_address_usertel,
					   @Param("receiver_address_useradr") String receiver_address_useradr);

	/**
	 * @param receiver_address_username
	 * @param receiver_address_usertel
	 * @param receiver_address_useradr
	 * @return
	 */
	Integer updateAddress(@Param("userid") long userid, @Param("receiver_address_id") long receiver_address_id,
						  @Param("receiver_address_username") String receiver_address_username,
						  @Param("receiver_address_usertel") String receiver_address_usertel,
						  @Param("receiver_address_useradr") String receiver_address_useradr);

}
