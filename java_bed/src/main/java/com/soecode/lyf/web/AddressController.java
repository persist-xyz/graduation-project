package com.soecode.lyf.web;

import com.soecode.lyf.entity.Address;
import com.soecode.lyf.service.AddressService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/address") // url:/模块/资源/{id}/细分 /seckill/list
public class AddressController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private AddressService addressService;

	@RequestMapping(value = "/queryAddressAll", method = RequestMethod.POST)
	@ResponseBody
	private List<Address> list(@Param("userid") long userid) {
		List<Address> list = addressService.queryAddressAll(userid);
		return list;
	}

	/*@RequestMapping(value = "/queryByName", method = RequestMethod.GET)
	@ResponseBody
	private Address queryByName(@Param("addressname") String addressname,@Param("addresspwd") String addresspwd,@Param("addresstype") String addresstype) {
		Address address = addressService.getByName(addressname,addresspwd,addresstype);
		if (address == null){
			System.out.print("===============");
			System.out.print(address);
			return address;
		}else {
			return address;
		}
	}*/

	@RequestMapping(value = "/addAddress", method = RequestMethod.POST)
	@ResponseBody
	private String addAddress(@Param("userid") long userid, @Param("receiver_address_username") String receiver_address_username,
							  @Param("receiver_address_usertel") String receiver_address_usertel,
							  @Param("receiver_address_useradr") String receiver_address_useradr) {
		Integer addList = addressService.addAddress(userid,receiver_address_username,receiver_address_usertel,receiver_address_useradr);
		return Integer.toString(addList);
	}

	@RequestMapping(value = "/updateAddress", method = RequestMethod.POST)
	@ResponseBody
	private String updateAddress(@Param("userid") long userid,  @Param("receiver_address_id") long receiver_address_id,
								 @Param("receiver_address_username") String receiver_address_username,
								 @Param("receiver_address_usertel") String receiver_address_usertel,
								 @Param("receiver_address_useradr") String receiver_address_useradr) {
		Integer updateAddress = addressService.updateAddress(userid,receiver_address_id,receiver_address_username,receiver_address_usertel,receiver_address_useradr);
		return updateAddress.toString();
	}

}
