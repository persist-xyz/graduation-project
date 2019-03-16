package com.soecode.lyf.web;

import com.soecode.lyf.entity.User;
import com.soecode.lyf.service.UserService;
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
@RequestMapping("/user") // url:/模块/资源/{id}/细分 /seckill/list
public class UserController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/queryUserAll", method = RequestMethod.POST)
	@ResponseBody
	private List<User> list() {
		List<User> list = userService.queryUserAll();
		return list;
	}

	@RequestMapping(value = "/queryUserById", method = RequestMethod.POST)
	@ResponseBody
	private List<User> list(@Param("userid") String userid) {
		List<User> list = userService.queryUserById(userid);
		return list;
	}

	@RequestMapping(value = "/queryByName", method = RequestMethod.POST)
	@ResponseBody
	private User queryByName(@Param("username") String username,@Param("userpwd") String userpwd,@Param("usertype") String usertype) {
		User user = userService.getByName(username,userpwd,usertype);
		if (user == null){
			System.out.print("===============");
			System.out.print(user);
			return user;
		}else {
			return user;
		}
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	@ResponseBody
	private String addUser(@Param("username") String username, @Param("userpwd") String userpwd, @Param("usertel") String usertel,
						   @Param("useradr") String useradr,@Param("usertype") String usertype,@Param("usersellername") String usersellername) {
		Integer addList = userService.addUser(username,userpwd,usertel,useradr,usertype,usersellername);
		return Integer.toString(addList);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	@ResponseBody
	private String updateUser(@Param("username") String username, @Param("usertel") String usertel,@Param("useradr") String useradr,
							  @Param("usertype") String usertype,@Param("usersellername") String usersellername,
							  @Param("usersendpay") String usersendpay,@Param("userdistributionpay") String userdistributionpay,
							  @Param("userAvatar") String useravatar) {
		Integer updateUser = userService.updateUser(username,usertel,useradr,usertype,usersellername,usersendpay,userdistributionpay,useravatar);
		return updateUser.toString();
	}

	@RequestMapping(value = "/updateUserPwd", method = RequestMethod.POST)
	@ResponseBody
	private String updateUserPwd(@Param("username") String username,@Param("userpwd") String userpwd) {
		Integer updateUser = userService.updateUserPwd(username,userpwd);
		return updateUser.toString();
	}

	@RequestMapping(value = "/updateUserTel", method = RequestMethod.POST)
	@ResponseBody
	private String updateUserTel(@Param("username") String username,@Param("usertel") String usertel) {
		Integer updateUser = userService.updateUserTel(username,usertel);
		return updateUser.toString();
	}

	@RequestMapping(value = "/updateUserAdr", method = RequestMethod.POST)
	@ResponseBody
	private String updateUserAdr(@Param("username") String username,@Param("useradr") String useradr,@Param("usertel") String usertel) {
		Integer updateUser = userService.updateUserAdr(username,useradr,usertel);
		return updateUser.toString();
	}
}
